package kidding.kartojimasone.hasmapas;

import java.util.HashMap;
import java.util.Map;

public class TwoThree {
    public static void main(String[] args) {
        TwoThree task = new TwoThree();

        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(10, "Adomas");
        numbers.put(15, "Zenius");
        numbers.put(20, "Kazys");
        numbers.put(25, "Leo");
        numbers.put(30, "Noname");

       System.out.println("Cia eilute is po  hMap " + numbers);
        Map<String, Integer > map = task.convertMap(numbers);
        task.printMap(map);
        task.printMapKeys(map);

    }

    private Map<String, Integer> convertMap(Map<Integer, String> numbers){
        Map<String, Integer> newMap = new HashMap<>();
        for(Map.Entry<Integer, String> entry: numbers.entrySet()){
    newMap.put(entry.getValue(), entry.getKey());
        }
        return newMap;
    }

    private void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("Raktas: %s, Reiksme:%s%n", entry.getKey(), entry.getValue());
        }
    }

   private void printMapKeys(Map<String, Integer> map) {
            for(String key: map.keySet()){
                System.out.println("Raktas: " + key);
            }
            }
    }
