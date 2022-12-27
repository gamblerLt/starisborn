package paveldejimas.interfaces.task;

public class Jeep implements  LandVehicle{
    private String name;
    private int numbOfWheels;
    private int passengers;
    private int speed;

    public void soundHorn() {
        System.out.println("Pyyyypt");
    }

    @Override
    public int getNumbWheels() {
        return numbOfWheels;
    }

    @Override
    public void setNumbWheels(int numbWheels) {
        this.numbOfWheels = numbWheels;

    }

    @Override
    public void drive() {
        System.out.println("Vairuoja " + name);

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public int getMaxPassengers() {
        return passengers;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
        this.passengers = passengers;

    }

    @Override
    public int getMaxSpeed() {
        return speed;
    }

    @Override
    public void setMaxSpeed(int speed) {
        this.speed = speed;

    }
}
