package kartojimas.traukinys;

import java.util.HashSet;
import java.util.Set;

abstract class Transport {
    protected final Set<Passenger> passengers;
    protected final int maxSeats;
    protected  TrainState state;


    Transport (int maxSeats){
        this.maxSeats = maxSeats;
        state = TrainState.STOPPED;
        passengers = new HashSet<>();

    }
    //cia metodeliai
    abstract void addPassenger(Passenger passenger);//dedami pasendzeriai i seta
    abstract  void removePassenger(Passenger passenger);
    abstract void printPassenger();

    //pakeisti steitta vaziuoti ir sustoti

    void startMoving() {
        state = TrainState.MOVING;
        System.out.println("VAziuoja");

    }
    void stopMoving() {
        state = TrainState.STOPPED;
        System.out.println("Stovi");

    }
    boolean isTransportFull(){
        return  maxSeats == passengers.size();
    }
}
