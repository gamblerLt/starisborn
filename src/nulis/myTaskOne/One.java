package nulis.myTaskOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Skaiciu");
        try {
            int skaicius = sc.nextInt();
            System.out.println(skaicius);
        }catch (InputMismatchException exception){
            System.out.println("Tikriausiai ivedete raides");

        }

    }

}
