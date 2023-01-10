package files.tasks.two;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DriverInput {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("driver_data2.csv"))){
            Driver driver;
            while((driver = (Driver) ois.readObject()) != null) {
                System.out.println(driver);
            }


        }catch (EOFException e) {
            System.out.println("Skaitau faila" + e.getMessage());
        }catch (Exception ex) {
            System.out.println("neskaitau failo" + ex.getMessage());
        }
    }
}
