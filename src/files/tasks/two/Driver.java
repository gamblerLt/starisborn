package files.tasks.two;

import java.io.Serializable;

public class Driver implements Serializable {
    private final String name;
    private final String carName;
    private final String carLicencePlates;
    private final int carMileage;

    public Driver(String name, String carName, String carLicencePlates, int carMileage) {
        this.name = name;
        this.carName = carName;
        this.carLicencePlates = carLicencePlates;
        this.carMileage = carMileage;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", carName='" + carName + '\'' +
                ", carLicencePlates='" + carLicencePlates + '\'' +
                ", carMileage=" + carMileage +
                '}';
    }
}
