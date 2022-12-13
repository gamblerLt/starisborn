package methods;

import java.util.Scanner;

public class MethTaskFour {
    public static void main(String[] args) {
       metMy('x', 'y');

    }
    public static int metMy(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite a reiksme");
        a = sc.nextInt();
        System.out.println("Iveskite b reiksme");
        b = sc.nextInt();
        int result = a * b;
        System.out.println("Daugyba: " + result);
        return result;
    }
   }

