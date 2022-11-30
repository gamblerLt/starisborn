package task;
import java.util.Scanner;
public class SecondTask {
    public static void main(String[] args) {
        //int s = 12;
        Scanner sc = new Scanner(System.in);
        System.out.println("Įveskite mėnesio skaičių");
        int s = sc.nextInt();

        if (s <= 0) {
            System.out.println("Netinkamas skaičius");
        } else if (s >= 13) {
            System.out.println("Netinkamas skaičius");
        } else if (s % 2 != 1) {
            System.out.println("Lyginis skaičius");

        } else {
            System.out.println("Nelyginis skaičius");
        }
        switch (s) {
            case 1 -> System.out.println("Sausis");
            case 2 -> System.out.println("Vasaris");
            case 3 -> System.out.println("Kovas");
            case 4 -> System.out.println("Gegužė");
            case 6 -> System.out.println("Birželis");
            case 7 -> System.out.println("Liepa");
            case 8 -> System.out.println("Rugpjūtis");
            case 9 -> System.out.println("Rugsėjis");
            case 10 -> System.out.println("Spalis");
            case 11 -> System.out.println("Lapkritis");
            case 12 -> System.out.println("Gruodis");
        }
    }
}
