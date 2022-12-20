package kidding.elseswitch;

import java.util.Scanner;

public class MetuLaikas {
    public static void main(String[] args) {
        String season;
        int monthNum;
        String answer;

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite menesio pavadinimas");
        monthNum = sc.nextInt();

        if(monthNum <= 3){
            answer = "1 ketvirtis";
        } else if (monthNum <= 6) {
            answer = "2 ketvirtis";
        } else if (monthNum <= 9) {
            answer = "3 ketvirtis";

        }else if (monthNum <= 12){
            answer = "4 ketvirtis";
        }else {
            answer = "Kosmonautas?";
        }
        System.out.println(answer);

    }
}
