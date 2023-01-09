package files.irasoobjekta;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) {

        try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("Object_output.txt"))) {

            //kestinam

            Person person;
            while ((person = (Person) oi.readObject()) != null) {
                System.out.println(person);
            }
//sita klaida mes visada kai failas suobjektais bus nuskaitytas
        }catch (EOFException ef) {
           //System.out.println("Failas nuskaitytas" + ef.getMessage());

            }catch(Exception e){
                System.out.println("Neskaitau failo" + e.getMessage());
            }
        }
    }

