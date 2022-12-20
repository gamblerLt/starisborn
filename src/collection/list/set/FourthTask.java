package collection.list.set;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FourthTask {

    private final Map<String, Student> students = new HashMap<>();


    public static void main(String[] args) {

        FourthTask task = new FourthTask();
        //kad pakartotu ta pati meniu, naudojam do while
        //kad galima butu reikia isikviesti menu ^
        Scanner sc = new Scanner(System.in);
        //System.out.println();

        String action;

        do{
            task.menu();
            action = sc.nextLine();
            task.userAction(action, sc);

        }while(!action.equals("3"));
    }

    // ivedimas
    private  void userAction(String action, Scanner sc){
        switch (action){
            case "1" -> addNewStudent(sc);
            case "2" -> findStudent(sc);
            case "3" -> System.out.println("Baigti");
            default -> System.out.println("tokio nera"); // ir si metoda issikvieciame prie do >> task.userAction((action, sc);

        }

                    }
    //metodas vartotojo ivedimui
        private void addNewStudent(Scanner sc){  // ji reikia issikviesti prie case 1
            System.out.println("Iveskite stufdento varda");
            String name = sc.nextLine();
            System.out.println("Iveskite stufdento pavarde");
            String surname = sc.nextLine();
            System.out.println("Iveskite stufdento Nr");
            String nr = sc.nextLine();
            System.out.println("Iveskite stufdento Universiteta");
            String university = sc.nextLine();

            students.put(nr, new Student(name, surname, university));
    }

    private void findStudent(Scanner sc){
        System.out.println("Iveskite studento Nr.");
        String nr = sc.nextLine(); //kaip gauti ka vartotojas ivede - >> reikia ji pasiimpti paduodant su get
        Student student = students.get(nr);
        if(student == null){
            System.out.println("Tokiu numeriu studento nera" + nr);
            return;

        }
        // o jeigu ne null, tai studenta rado ir reikia paspausdinti:
        System.out.printf("%s -> %s%n", nr, student);
    }

    private void menu(){
        System.out.println("""
               1. Ivesti studenta
               2. Gauti studento numeri
               3. Baigti programa
                """);
    }
}
