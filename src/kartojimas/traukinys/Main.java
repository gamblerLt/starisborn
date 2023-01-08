package kartojimas.traukinys;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Transport train = new Train(20);
        Scanner sc = new Scanner(System.in);


        String action;

        do {
            main.menu();
            action = sc.nextLine();
            main.userSelection(action, sc, train);

        } while (!action.equals(6));
    }
private  void userSelection(String action, Scanner sc, Transport train){

        switch (action) {
            case "1" -> addCustomerToTrain(sc, train);
            // ives vartotojas, tai tiek ju ir turi ivesti
            case "2" -> train.startMoving();
            case "3" -> train.stopMoving();
            case "4" -> removePassengers(sc, train);
            case "5" -> train.printPassengers();
            case "6" -> System.out.println("Programa baige darba");
        }

}
private void addCustomerToTrain(Scanner scanner, Transport transport){
    int number = getCorrectNumbers(scanner, "kiek keleiviu laipinsite");
    int availableSeats = transport.getAvailableSeats();

    if (number > availableSeats){
        System.out.printf("Atlesikite, galime ilaipinti tik %skeleivius %n", availableSeats);
        number = availableSeats;
    }

    try {
        for (int i = 0; i < number; i++) {
            System.out.printf("Iveskite %s keleivi %n", i + 1);
            Passenger passenger = createPassenger(scanner);
            transport.addPassenger(passenger);
        }
    }catch (TrainExeption ex) {
        System.out.println(ex.getMessage());
    }

}

private void removePassengers(Scanner sc, Transport transport) {
    System.out.println("Iveskite islipimo stotele:");
    String destination = sc.nextLine();

    try {
        transport.removePassengers(destination);
    }catch (TrainExeption e) {
        System.out.println(e.getMessage());
    }
}

private Passenger createPassenger(Scanner sc) {
    System.out.println("Iveskite varda: ");
    String name = sc.nextLine();
    System.out.println("Iveskite pavarde: ");
    String surname = sc.nextLine();
    System.out.println("Iveskite keliones tiksla:");
    String destination = sc.nextLine();

    return new Passenger(name, surname, destination);
}

private int getCorrectNumbers(Scanner sc, String text) {
        while (true) {
            try {
                System.out.println(text);
                return Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Netinkama ivestis");
            }
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
