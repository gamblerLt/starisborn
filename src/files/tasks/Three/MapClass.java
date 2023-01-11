package files.tasks.Three;

import java.io.*;
import java.util.*;

public class MapClass {

    private static final String PERSON_FILE_NAME = "people.txt";
    private static final String PAYMENT_FILE_NAME = "payment.txt";
    private static final String ID = "id";
    private static final String REGEX= ",";
    //klases lygio mapas
    private final Map<Integer, Person> persons = new HashMap<>();

    public static void main(String[] args) {
        //MapClass mapClass = new MapClass();


        MapClass mapClass = new MapClass();
        mapClass.filUpPersons();
        mapClass.readPayments();
        mapClass.writeMostReceivedMoneyPersons();

        //meniu

       String action;

      do {
            mapClass.menu();
            action = FileReader(PAYMENT_FILE_NAME);
            mapClass.readPayments();
        }while (!action.equals(4));

    }

    private void menuPayments(String action) {
        switch (action) {
            case "1" -> System.out.println();
            case "2" -> System.out.println();
            case "3" -> System.out.println();
            case "4" -> System.out.println();
        }
    }
    private void filUpPersons() {
        try(BufferedReader br = new BufferedReader(new FileReader(PERSON_FILE_NAME))) {
            //nuskaitome faila:
            String line;
            while((line = br.readLine()) != null) {
                if(line.startsWith(ID)) {
                    continue;
                }

                String[] splits = line.split(REGEX);
                if(splits.length < 3) {
                    continue;
                }
                int id = Integer.parseInt(splits[0]);
                if(persons.get(id) == null) {

                    persons.put(id, new Person(id, splits[1].trim(), splits[2].trim()));
                }
            }

        }catch (IOException e) {
            System.out.println("Negaliu skaityti failo" + PERSON_FILE_NAME + e.getMessage());
        }
    }
    private void readPayments() {
        List<Integer>transactions = new ArrayList<>();
        try (BufferedReader bw = new BufferedReader(new InputStreamReader(new FileInputStream(PAYMENT_FILE_NAME)))) {
            String line;
            while((line = bw.readLine()) != null) {
                if (line.startsWith(ID)) {
                    continue;
                }

                String[] splits = line.split(REGEX);
                if (splits.length < 4) {
                    continue;
                }

                int id = Integer.parseInt(splits[0]);
                if(transactions.contains(id)) {
                    continue;
                }
                transactions.add(id);
                int sum = Integer.parseInt(splits[1].trim());
                addSentMoney(sum, splits[3]);
                addReceivedMoney(sum,splits[2]);

            }
        }catch (IOException e) {
            System.out.println(PAYMENT_FILE_NAME + e.getMessage());
        }
    }
    private void addSentMoney(int sum, String id) {
        int senderId = Integer.parseInt(id.trim());
        Person sender = persons.get(senderId);
        if(sender != null) {
            sender.setSentMoney(sender.getSentMoney() + sum);
        }
    }
    private  void addReceivedMoney(int sum, String id) {
        int receivePersonId =Integer.parseInt(id.trim());
        Person person = persons.get(receivePersonId);
        if(person != null) {
            person.setReceivedMoney(person.getReceivedMoney() + sum);
        }
    }
    //  mazejimo tvarka gave daugiausiai piniu
    private void writeMostReceivedMoneyPersons() {
       List<Person> sortedPersons = new ArrayList<>(persons.values());
       sortedPersons.sort(Comparator.comparingInt(Person :: getReceivedMoney).reversed());
    }
    //komperatorius atlieka rikiavima kolekcijoje

   /* private Comparator<Person> SORT_BY_RECEIVED_MONEY_ASC = ("o1, o2") -> {
        return Integer.compare(o1.getReceivedMoney, o2)
    }*/

    private void menu() {
        System.out.println("""
                1. User with max money transferes, number transferes.
                2. User with max income transferes, number transferes.
                3. Max transwere. Person, amount, to whom.
                4. Min transfere. Person, amount, to whom.
                """);
    }
}
