package files.tasks.two;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DriverOutput {
    public static void main(String[] args) {
        try(ObjectOutputStream oboust = new ObjectOutputStream(new FileOutputStream("driver_data2.csv"))) {
            oboust.writeObject(new Driver("Rimas", "Volvo","AAA114", 25458));
            oboust.writeObject(new Driver("Antanas", "VW","CCF985", 598225));
            oboust.writeObject(new Driver("Juozas","Opel", "PPM547", 956587));
            oboust.writeObject(new Driver("Onute","Honda", "AAA111", 123456));
            oboust.writeObject(new Driver("Maryte","PanzerBar","HTY585", 155547));

        }catch (IOException e) {
            System.out.println("No write to file" + e.getMessage());
        }

    }
}
//private