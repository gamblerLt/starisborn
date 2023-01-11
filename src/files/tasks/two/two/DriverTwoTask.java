package files.tasks.two.two;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DriverTwoTask {
    public static void main(String[] args) {
        DriverTwoTask driverTwoTask = new DriverTwoTask();

        List<DriverTwo> drivers = List.of(new DriverTwo("Rimas","Audi","LLL888",114455));
        new DriverTwo("Algis","ZAZ","PPP555",556585);
        new DriverTwo("Pedro", "Mazda","OOI632",785458);

        driverTwoTask.writeDrivers(drivers, "driversTwo.csv");
    }
    private void writeDrivers(List<DriverTwo> drivers, String fileName) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for(DriverTwo driverTwo: drivers) {
                bw.write(driverTwo.toString());
                bw.newLine();
            }

        }catch (IOException e) {
            System.out.printf("Cannot write to %s, reason %s", fileName, e.getMessage());
        }
    }
}
