package kidding.failai.poema;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class NepoemaOut {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("nepoema.txt"))) {
            oos.writeObject(new Nepoema(112223,332225));

        }catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }
}
