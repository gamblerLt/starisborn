package files.irasoobjekta;

import files.irasoobjekta.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) {
//apendinti cia neiseis
        try (ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("Object_output.txt"))) {
            ob.writeObject(new Person("Rimas", "Spakauskas", 45));

        }catch (IOException e) {
            System.out.println("negaliu irasuti i faile" + e.getMessage());
        }
    }
}
