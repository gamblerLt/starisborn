package paveldejimas.interfaces.task;

public class Hovercraft implements SeaVehicle, LandVehicle{

    private int numbOfWheels;
    private int displacement;
    private String name;
    private int maxPassengers;
    private int maxSpeed;

    public Hovercraft(int numbOfWheels, int displacement, String name, int maxPassengers, int maxSpeed) {
        this.numbOfWheels = numbOfWheels;
        this.displacement = displacement;
        this.name = name;
        this.maxPassengers = maxPassengers;
        this.maxSpeed = maxSpeed;
    }

    public void enterLand(){

        System.out.println("Vaziuoja zeme");
    }

    public  void
     enterSea(){
        System.out.println("Plaukia vandeniu");
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
        System.out.println("Houveris pareina");

    }

    @Override
    public int getDisplacement() {
        return displacement;
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;

    }

    @Override
    public void launch() {
        System.out.println("running");

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
        return maxPassengers;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;

    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void setMaxSpeed(int speed) {
        this.maxSpeed = maxSpeed;

    }
}
