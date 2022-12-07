package task;

import java.util.Arrays;
import java.util.Scanner;

/*
/Parasykite programa, kuri nustato ar loterijos bilietas yralaimingas.
/Loterijos bilieto 6 zenklis numeris laikomas laimingu, jeigu jo pirmuju triju skiciu suma
/lygi paskutiniu triju skaiciu sumai.
/Bilieto numeri perduokite komandineje eiluteje. pvz 968745
 */
public class Lottery {
    public static void main(String[] args) {

        int[] array = new int[6];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite sesiazenkli loterijos bilieto skaiciu:");
        for (int i = 0; i < array.length; i++)

            //nuskaito userio ivedamus skaicius
            array[i] = scanner.nextInt();

        System.out.println("jusu sk ");
        for (int i = 0; i < array.length; i++) ;

       int first = array[0 - 2];
       int second = array [3 - 5];
        int sum2 = first + second;
        System.out.println(first);
        System.out.println(second);
        System.out.println(sum2);

        /*int sum = 0;
        for(int i = 0; i <3; i++);
        sum += Arrays.stream(array).sum();*/
       // 555 sum = sum + Arrays.stream(array).sum();

        /*firstNum = numbers.get(0);
        lastNum = numbers.get(numbers.size() - 1);*/


        {
           System.out.println(Arrays.toString(array));
        //  System.out.println("Visa ivesta suma yra: " + sum);
        }


// irasyti ta sk i masyva
            // istraukti pirmus tris ir paskutinius tris ir susumuoti
            //tada palyginti


            //   private boolean isSumEqual ( int sum){

            // }
        }

    }







//String[] mass = "1234566".split("");