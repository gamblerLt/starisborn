package files.tasks.one;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Irasyk savo varda");
        String line = sc.nextLine();

       File file = new File("taskOne.txt");

        try(BufferedWriter bwr = new BufferedWriter(new FileWriter("taskOne.txt", true))) {
            bwr.write(line);
            bwr.newLine();

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
/*Scanner sc = new Scanner(System.in);
        System.out.println("Irasykite kazka");
        String line = sc.nextLine();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt", true))) {
            bw.write(line);
            bw.newLine();
        }catch (IOException e) {
            System.out.println("Negaliu irasyti i faila" + e.getMessage());
        }
    }*/