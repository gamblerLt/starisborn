package task;
import java.util.Scanner;
public class Twelwe52w {

    public static void main(String[] args){
        System.out.println("Iveskite 5 vardus: ");
        var names = getNames();

        for(var j = 0; j < names.length; j++){
            var currentName = names[j];
            var modiefiedName = currentName.toUpperCase() + "-" + currentName.length() + "-" + j;
            System.out.println(modiefiedName);
        }
    }
    static String[] getNames(){
        var scanner = new Scanner(System.in);
        var names = new String[5];

        for(var i = 0; i<=4; i++) {
            var name = scanner.nextLine();
            names[i] = name;
        }
        return names;
    }
}
