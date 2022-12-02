package task;
import java.util.Scanner;
public class FunctionTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite x reikšmę: ");
        int x = scanner.nextInt();
        if(x > 0){
            int result1 = 2 * x + 8;
            System.out.println(result1);
        }else if(x < 0){
            int result2 = 21 - 7 * x;
            System.out.println(result2);
        }else{
            System.out.println("Su nuliais šiandien nėra noro skaičiuoti ;)");
        }
    }
}