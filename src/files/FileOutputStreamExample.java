package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite kazka");
        String line = scanner.nextLine();

        File file = new File("output.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

//jeigu nepridesiu appendo, tai perrasys
        try(FileOutputStream outputStream = new FileOutputStream(file, true)) {

            for(int i = 0; i < line.length(); i++) {
                outputStream.write(line.charAt(i));
            }

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
