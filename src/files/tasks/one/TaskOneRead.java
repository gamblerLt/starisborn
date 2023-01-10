package files.tasks.one;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TaskOneRead {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader((new FileReader("taskOne.txt")))){
            String line;
            while ((line = bfr.readLine()) != null) {



                System.out.println(line);

                StringBuilder sb = new StringBuilder(line);
                sb.reverse();

                String result = sb.toString();
                System.out.println(result);


            }

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
