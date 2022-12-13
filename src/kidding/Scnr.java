package kidding;

import java.util.Scanner;

public class Scnr {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite 1 sk: ");
        a = scanner.nextInt();
        System.out.println("Iveskite 2 sk:");
        b = scanner.nextInt();

        int result = a * b;

        System.out.println("Sk sandauga: " + result);
    }
}
