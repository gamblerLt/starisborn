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


        //reversuoti i faila
            /* StringBuilder sb = new StringBuilder(line);
                sb.reverse();

                String result = sb.toString();
                System.out.println(result);*/

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
