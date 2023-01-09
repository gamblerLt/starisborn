package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Irasykite kazka");
        String line = sc.nextLine();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt", true))) {
            bw.write(line);
            bw.newLine();
        }catch (IOException e) {
            System.out.println("Negaliu irasyti i faila" + e.getMessage());
        }
    }
}
