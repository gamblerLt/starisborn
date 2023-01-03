package kartojimas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PirminiaiSkaiciai {

    public static void main(String[] args) {
        PirminiaiSkaiciai prime = new PirminiaiSkaiciai();
        List<Integer> numbers = new ArrayList<>();
        Scanner scaner = new Scanner(System.in);
        System.out.println("Iveskite pirmaji sveika skaiciu");
        int a = scaner.nextInt();
        System.out.println("Iveskite antraji sveikaji skaiciu");
        int b = scaner.nextInt();

        //System.out.println(a + b);

       for (int i = a; i <= b; i ++){
           if(prime.prim(i)) {
               numbers.add(i);
           }
       }
        System.out.println(numbers);
    }
    private  boolean prim(int i) {
        for (int j = 2; j <= i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return  true;
    }
}
