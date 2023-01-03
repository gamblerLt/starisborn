package kartojimas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
       /* Armstrong armstrong = new Armstrong();
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite 3 - zenkli Armstrongui patikrinti");*/

        Armstrong armstrong = new Armstrong();

        int a = 100;
        int b = 999;


        //kurti cikla

        for (int i = a; i <= b; i++) {
            if(armstrong.isArmstrongNumber(i)){
                System.out.println(i);
            }
//dar pridejo charat
        }
    }
    //metodas reikalingas

    private  boolean isArmstrongNumber(int number){
        //100 == 1^3 + 0^3 + 0^3
        int a = number % 10;
        number = number / 10;
        int b = number % 10;
        number = number / 10;
        int c = number % 10;

        int sum = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));

        return false;
    }

}
