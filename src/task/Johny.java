package task;

import java.util.Arrays;
import java.util.Scanner;

public class Johny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite zodi:");
        String word = scanner.nextLine();

        char mas[] = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            mas[i] = word.charAt(i);
        }
        //System.out.println(mas);

        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.println(mas[i]);
        }
    }
}
