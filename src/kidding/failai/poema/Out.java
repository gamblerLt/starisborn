package kidding.failai.poema;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Out {
    public static void main(String[] args) {
        try(ObjectOutputStream oustr = new ObjectOutputStream(new FileOutputStream("eilerastis.txt"))) {
            oustr.writeObject(new Poema("Du gaideliai", "Baltus zirnius kule \n dvi visteles i maluna \n veze"));

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
