package files.tasks.Three;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MapClass {

    private static final String PERSON_FILE_NAME = "people.txt";
    private static final String ID = "id";
    private static final String REGEX= ",";
    //klases lygio mapas
    private final Map<Integer, Person> persons = new HashMap<>();

    public static void main(String[] args) {
        MapClass mapClass = new MapClass();
        mapClass.filUpPersons();

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
                    Person person = new Person(id, splits[1].trim(), splits[2].trim());
                    persons.put(id, person);
                }

            }

        }catch (IOException e) {
            System.out.println("Negaliu skaityti failo" + PERSON_FILE_NAME + e.getMessage());
        }
    }
}
