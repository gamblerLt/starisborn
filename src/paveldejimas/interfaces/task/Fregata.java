package paveldejimas.interfaces.task;

public class Fregata implements SeaVehicle{

    private int displacement;
    private String name;
    private int maxPassenger;
    private int maxSpeed;

    public Fregata(int displacement, String name, int maxPassenger, int maxSpeed) {
        this.displacement = displacement;
        this.name = name;
        this.maxPassenger = maxPassenger;
        this.maxSpeed = maxSpeed;
    }

    public void fireGun(){
        System.out.println("Booom");
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
        System.out.println("Launching");

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
        return maxPassenger;
    }

    @Override
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassenger = maxPassenger;

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
