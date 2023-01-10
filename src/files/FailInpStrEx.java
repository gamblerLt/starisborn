package files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FailInpStrEx {

    public static void main(String[] args) {

        try (InputStream inputStream = new FileInputStream("output.txt")) {
        int letter;
        while ((letter = inputStream.read()) > 0) {
            System.out.println((char)letter);
        }
    }
            catch (
    IOException e){
        System.out.println(e.getMessage());

    }
}
}

