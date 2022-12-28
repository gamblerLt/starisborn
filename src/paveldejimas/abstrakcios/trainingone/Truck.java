package paveldejimas.abstrakcios.trainingone;

import java.time.LocalDate;

public class Truck extends  Transport {
    private final double maxWeight;

    public Truck(LocalDate registrationDate, double maxWeight, String color){
        super(registrationDate, color);
        this.maxWeight = maxWeight;

    }

    public  double getMaxWeight(){
        return  maxWeight;
    }
    @Override
    public void go(){
        System.out.println("Sunkvezimis vaziuoja");
    }

}


