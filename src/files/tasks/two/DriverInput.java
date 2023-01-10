package files.tasks.two;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DriverInput {
    public static void main(String[] args) {
        System.out.println("Duomenys iš .csv failo: \nVardas - Markė - Numeris - Rida ");
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("driver_data2.csv"))){
            Driver driver;
            while((driver = (Driver) ois.readObject()) != null) {
                System.out.println(driver);
            }


        }catch (EOFException e) {
            System.out.println("Failas perskaitytas: " + e.getMessage()); // kodel null
        }catch (Exception ex) {
            System.out.println("Kita klaida!" + ex.getMessage());
        }
    }
}
