package randomtask;

import java.util.Random;
import java.util.Scanner;

public class RandomDice {
    public static void main(String[] args) {
        Random random = new Random(); // pasikuriam random objekta
        int first = random.nextInt(6) +1; //cia dvieju kauliuku generacija
        int secont = random.nextInt(6) +1;

        //sukuriame ivesti

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite");
        int numb = scanner.nextInt();

        int sum = first + secont;

        if (sum > numb){
            System.out.printf("Spejimas  %d , reikejo  %d didesnio %n", numb, sum - numb ); // %d decimel - skaicius
        }else if(sum < numb){
            System.out.printf("Spejimas  %d , reikejo  %d didesnio %n", numb, numb - sum );
        }else{
            System.out.printf("Atspejote");
        }
    }
}
