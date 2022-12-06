package task;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.util.Random;
import java.util.Scanner;

public class MasTask {
    public static void main(String[] args) {
      //  int numb;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Irasykite masyvo ilgi: ");
        int length = scanner.nextInt();

        if(length > 7){
            Random random = new Random();
            length = random.nextInt(8) + 1;
        }

        int[] mas = new int[length];
        mas[0] = mas.length;;
        mas[mas.length - 1] = mas.length;

        System.out.println(mas.toString());
    }
    ;
}
