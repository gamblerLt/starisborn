package task;

import java.util.Arrays;
import java.util.Scanner;

public class MAsTaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite aodi");
       /* char[] array = new char[4];
        array[0] = 'j';
        array[1] = 'a';
        array[2] = 'v';
        array[3] = 'a';

        System.out.println(array);*/

        String word = scanner.nextLine();
                //String word = "Java";
        word = word.toUpperCase();
        char[] mas = new char[word.length()]; //kuriame zodzio ilgio masyva
        for (int i = 0; i < mas.length; i++){
            mas[i] = word.charAt(i);
        }
        System.out.println(Arrays.toString(mas));
    }

}
