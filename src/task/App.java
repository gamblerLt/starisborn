package task;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        System.out.println("iveskite teksta");
        String[] input = getInput().split("");
        Double number1 =Double.parseDouble(input[0]);
        Double number2 = Double.parseDouble(input[1]);
        String symbol = input[1];



      //  new Formulas().calculate();
    }
    public static String getInput(){
        var scanner = new Scanner((System.in));
        return scanner.nextLine();
    }
}
//single resposability - vienas veiksmas