package kartojimas.traukinys;

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
    void removePassenger(Passenger passenger) {

    }

    @Override
    void printPassenger() {

    }
}
