package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("Object_output.txt"))) {

            String line;
//sitas readeris yra geras ir rekomenduojamas naudoti

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }catch (IOException e) {
            System.out.println("Cannot read file " + e.getMessage());
        }

    }
}
