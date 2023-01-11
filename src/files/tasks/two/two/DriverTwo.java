package files.tasks.two.two;

public record DriverTwo(String name, String carModel, String plateNumber, int mileage) {

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s",name,carModel,plateNumber,mileage);

    }
}
