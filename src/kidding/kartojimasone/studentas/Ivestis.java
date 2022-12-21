package kidding.kartojimasone.studentas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ivestis{

    private final Map<String, Person> persons = new HashMap<>();

    public static void main(String[] args) {
        Ivestis task = new Ivestis();
        Scanner sc = new Scanner(System.in);

        String action; // kaip ir metodas?

        do{
            task.menu();
            action = sc.nextLine();
            task.userAction(action, sc);
        }
        while (!action.equals("3"));
    }
    private void userAction(String action, Scanner sc){
        switch (action){
            case "1" -> addNewPerson(sc);
            case "2" -> findPerson(sc);
            case "3" -> System.out.println("Baigti darba.");
            default -> System.out.println("Tokių reikšmių nebuvo");
        }
        }
        private void addNewPerson(Scanner sc){
            System.out.println("Iveskite asmens vardą: ");
            String name = sc.nextLine();
            System.out.println("Iveskite asmens pavardę: ");
            String surname = sc.nextLine();
            System.out.println("Iveskite asmens ID: ");
            String id = sc.nextLine();
            System.out.println("Iveskite asmens miestą: ");
            String touwn = sc.nextLine();
            persons.put(id, new Person(name, surname, touwn));
    }
    private void findPerson(Scanner sc){
        System.out.println("Įveskite asmens ID: ");
        String id = sc.nextLine();

        Person person = persons.get(id);
        if(person == null){
            System.out.println("Tokio asmens mes neturime!");
            return;
        }
        System.out.printf("%s -> %s%n", id, person);
    }
    private  void menu(){
        System.out.println("""
                <<Pasirinkite vieną iš meniu punktų>>
                1. Įveskite asmens duomenis:
                2. Gauti studento numeri:
                3. Įveskite miestą:
                """);
    }

}
