package cwhile;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
public class GuesNum {
    public static void main(String[] args) {


        int n = 100;
        int[] mas = new int[n];
        Arrays.setAll(mas, i -> i + 1);
        System.out.println("Masyvo skaiciai yra sie: " + Arrays.toString(mas));

        //generuoti random
        System.out.println("Atsitiktinis masyvo skaicius yra: " + mas[new Random().nextInt(mas.length)]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Atspekite atsitiktini skaiciu: ");

        int i = scanner.nextInt();

        int num = 0;
        for(int j = 0; j < mas.length; j++){
            if(mas[j] == i){
                num = mas[i];
                break;
            }
       // if (i == mas[new  Random().nextInt(mas.length)]) {
            System.out.println("Atspejote");
            //i++;
        }
        if(num > 0) {
            System.out.println(num);
        }
          //  while (i== mas[new Random().nextInt(mas.length)]);

        }
    }
