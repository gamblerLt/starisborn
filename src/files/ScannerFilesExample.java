package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFilesExample {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("example.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }

