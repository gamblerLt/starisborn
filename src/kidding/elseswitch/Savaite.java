package kidding.elseswitch;

import java.util.Scanner;

public class Savaite {
    public static void main(String[] args) {
        int weekNum;
        String weekName;

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite savaites dienos numeri");
        weekNum = sc.nextInt();

        switch (weekNum){
            case 1 -> weekName = "Monday";
            case 2 -> weekName = "Tuesday";
            case 3 -> weekName = "Wednesday";
            case 4 -> weekName = "Thursday";
            case 5 -> weekName = "Friday";
            case 6 -> weekName = "Saturday";
            case 7 -> weekName = "Sunday";
            default -> weekName = "Blacday";

        }
        System.out.println("Jus ivedete " + weekNum + "ir tai yra " + weekName);
    }
}
