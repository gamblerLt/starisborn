/*
package paveldejimas.taskthreeonesix;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataBase implements Storage {

    @Override
    public void saveInfo(Info info) {

        HashMap<Integer, String> information = new HashMap<Integer, String>();
        boolean loopAgain = true;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Įveskite ID");
            Integer id = Integer.parseInt(sc.nextLine());

            System.out.println("Įveskite tekstą");
            String text = sc.nextLine();

            String userInput = information.put(id, text);
            if (userInput != null) {
                System.out.println("Id =" + id + userInput + "Perrašyta į " + text);
            }
            System.out.println("Ar dar įvesite daugiau duomenų? T / N ");
            String answer = sc.nextLine();

            if (answer.equals("y") || answer.equals("Y")) {
                continue;

            } else {

                break;
            }
            while (loopAgain) ;
            sc.close();

            System.out.println("Duomenu bazeje yra sie duomenys: " + information.get(id) + " " + information.get(text));
        }
*/


        /*information.put(1,"Vienas");
        information.put(2, "Du");
        information.put(3, "Trys");
        information.put(4, "Keturi");
        information.put(5, "Penki");*/


    /*    @Override
        public int findInfo ( int Id){

            //Scanner scanner = new Scanner(System.in);

            System.out.println("Iveskite Key reikšmę patikrinti ar tokia egzistuoja:");
            int key = sc.nextInt();
            if (information.containsKey(key)) {
                System.out.println("Toks raktas yra!");
            } else {
                System.out.println("Tokio rakto nėra, įveskite kitą raktą:");
            }
            return sc.nextInt();


        }

        @Override
        public String findStringInfo (String textInfo){
            // Scanner scanner = new Scanner(System.in);
            System.out.println("Kokio žodžio ieškote?");
            String value = sc.nextLine();
            if (information.containsValue(value)) {
                System.out.println("Toks žodis yra");
            } else {
                System.out.println("Tokio žodžio nėra, įveskite kitą žodį");
            }

            return sc.nextLine();
        }
    }

}*/


/* saugotiInfo metodas išsaugo gautą Info objektą į HashMap
• Pirmasis rastiInfo metodas gauna Info iš map‘o pagal key (id) ir grąžina jį
• Antrasis rastiInfo metodas gauna Info iš map‘o iteruodamas kiekvieną
reikšmę ir tikrindamas ar per parametrus gautas žodis yra Info objekto
tekste. Grąžina pirmą rastą Info objektą
• Visi metodai atspausdina kas buvo padaryta: „Issaugota i duomenu baze“,
„Rasta duomenu bazeje pagal id“, „Rasta duomenu bazeje pagal zodi*/
