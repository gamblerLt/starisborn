package kidding.failai.poema;

import java.io.*;

public class Inp {
    public static void main(String[] args) {
        try(ObjectInputStream obin = new ObjectInputStream(new FileInputStream("eilerastis.txt"))) {
            Poema poema;
            while ((poema = (Poema) obin.readObject()) != null) {
                System.out.println(poema);
            }
        }catch (EOFException eo) {
            System.out.println(eo.getMessage());
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }

        try(ObjectInputStream oinp = new ObjectInputStream(new FileInputStream("nepoema.txt"))) {
            Nepoema nepoema;
            while((nepoema = (Nepoema) oinp.readObject()) != null) {
                System.out.println(nepoema);
            }

        }catch (EOFException eo) {
            System.out.println(eo.getMessage());
        }catch (Exception eee) {
            System.out.println(eee.getMessage());
        }
    }
}
