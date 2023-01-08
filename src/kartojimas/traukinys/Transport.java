package kartojimas.traukinys;

import java.util.HashSet;
import java.util.Set;

abstract class Transport {
    protected final Set<Passenger> passengers;
    protected final int maxSeats;
    protected TrainState state;


    Transport(int maxSeats) {
        this.maxSeats = maxSeats;
        state = TrainState.STOPPED;
        passengers = new HashSet<>();

    }

    //cia metodeliai
    abstract void addPassenger(Passenger passenger);//dedami pasendzeriai i seta

    abstract void removePassengers(String destination);

    abstract void printPassengers();

    //pakeisti steitta vaziuoti ir sustoti

    void startMoving() {
        if (state.equals(TrainState.MOVING)) {
        System.out.println("Transporto priemone vaziuoja");
        return;

    }

    state = TrainState.MOVING;
    System.out.println("Transporto priemone vaziuoja");

}


    void stopMoving() {
        if (state.equals(TrainState.STOPPED)) {
            System.out.println("Transporto priemone sustojusi");
            return;

        }
        state = TrainState.STOPPED;
        System.out.println("Transporto priemone stovi");

    }

    boolean isTransportFull() {

        return maxSeats == passengers.size();
    }
    int getAvailableSeats() {

        return maxSeats - passengers.size();
        }
}
