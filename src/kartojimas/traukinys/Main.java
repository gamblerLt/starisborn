package kartojimas.traukinys;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    //private final Map<String, Student> students = new HashMap<>();
    // hasmapo sake nereikia, bet pasidariau prinscreena vordiniame

    public static void main(String[] args) {

        Main objMain = new Main();

        Scanner scanner = new Scanner(System.in);
        String action;

        do {
            objMain.menu();
            action = scanner.nextLine();
            objMain.userAction(action, scanner);

        } while (!action.equals(5));
    }
private  void userAction(String action, Scanner scanner){

        switch (action) {
            case "1" -> System.out.println("Ilaipinti keleivius"); //kek keleiviu ilips (nebutinai),
            // ives vartotojas, tai tiek ju ir turi ivesti
            case "2" -> System.out.println("Pradeti vaziuoti");
            case "3" -> System.out.println("Sustoti");
            case "4" -> System.out.println("Islaipinti keleivius");
            case "5" -> System.out.println("Keleiviu saraso atspausdinimas");
            case "6" -> System.out.println("Exit");
        }

}

    private void menu(){
        System.out.println("""
                1. Ilaipinti keleivius //ivesti vardus destination do while scanner
                2. Pradeti vaziuoti
                3. Sustoti
                4. Islaipinti keleivius
                5. Keleiviu saraso atspausdinimas
                6. Exit
                """);
    }



}
