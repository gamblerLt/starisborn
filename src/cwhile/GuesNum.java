package cwhile;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
public class GuesNum {
    public static void main(String[] args) {


        int n = 100;
        int[] mas = new int[n];
        Arrays.setAll(mas, i -> i + 1);
        System.out.println("Masyvo skaiciai yra sie: " + Arrays.toString(mas));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite sk: ");
       /* try {
            System.out.println("Iveskite skaiciu nuo 1 iki 100:");
            int i = scanner.nextInt();

         //   System.out.println("Jusu ivestas skaicius yra " + i);
        } catch (InputMismatchException ex) {

            scanner.nextLine();

            //System.out.println("Jusu ivesto skaiciaus masyve nera. Iveskite kita skaiciu" + mas.length);
        } while (n <= 100);
        System.out.println("Iveskite  100 ar maziau");*/
        int i = scanner.nextInt();


        while(i < 10){
            System.out.println("Iveskite sk");
            i++;
        }
        do
            System.out.println(i);

        while (i < 10);



    }
}