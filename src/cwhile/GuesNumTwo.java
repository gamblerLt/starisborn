package cwhile;

import java.util.Random;
import java.util.Scanner;

public class GuesNumTwo {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

       int randomNumb = random.nextInt(100) + 1;

       int count = 0;
       int value;

       do {
           count++;
           value = scanner.nextInt();
           if(value > randomNumb){
               System.out.println("skaicius per mazas");
           }else if (value < randomNumb){
               System.out.println("per didelis");
           }else{
               System.out.println("atspejai");
           }



       }while (randomNumb == value || count < 10);
    }

}
