package kidding;

import java.util.Scanner;

public class LastMet {
    public static void main(String[] args) {
        metOne(2);

    }
    public static void metOne(int x){
        int z;
        Scanner sc = new Scanner(System.in);
        System.out.println("iveskite b reiksme");
        z = sc.nextInt();
        int result = x + z;
        System.out.println(result);
    }
}
