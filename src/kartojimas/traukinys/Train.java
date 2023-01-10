package kartojimas.traukinys;

import java.util.Iterator;
import java.util.Set;

public class Train extends  Transport{

    public Train(int maxSeats) {

        super(maxSeats);
    }
//implementinimas
    @Override
    void addPassenger(Passenger passenger) {
        if(state.equals(TrainState.MOVING)){
            //TODO throw exeption
            throw new TrainExeption("Negalima prideti keleivio nes traikinys juda");
        }
        //patikrinti vietu skaiciu

        if(isTransportFull()){
            //TODO throw exeptios
            throw  new TrainExeption("Negalima prideti keleiviu nes traukinis pilnas");
        }

        passengers.add(passenger); //galimybe ideti keleivi i kolekcija
    }

    @Override
    void removePassengers(String destination) {
        if(state.equals(TrainState.MOVING)) {
            throw  new TrainExeption("Negalime islaipinti keleivio is judancios transporto priemones");
        }

        Iterator<Passenger> iterator = passengers.iterator();
        while(iterator.hasNext()) {
            Passenger passenger = iterator.next();
            if (passenger.getDestination().equals(destination)){
                iterator.remove();
            }
        }

    }

    @Override
    void printPassengers() {
        if(passengers.isEmpty()){
            System.out.println("Keleiviu nera");
        }
        for(Passenger p : passengers) {
            System.out.println(p);
        }

    }
}
