package eleven;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class YearWhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite metus");
        int year = sc.nextInt();

    //   GregorianCalendar calendar = new GregorianCalendar();
    //   boolean isLeapYear= calendar.isLeapYear(year);
    //   System.out.println(isLeapYear);

        //   int year = 4000;

        if (year % 4 != 0) {
            System.out.println("Nera keliamieji metai (4)");
        }else if(year % 100 == 0){
            System.out.println("Keliamieji  metai (100)");
        } else if(year % 400 == 0) {
            System.out.println("Paprasti metai (400)");

        }else{
            System.out.println("Else keliamieji");
        }
    }

}
