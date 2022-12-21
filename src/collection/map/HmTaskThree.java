package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HmTaskThree {
    public static void main(String[] args) {
       HmTaskThree task = new HmTaskThree();



        Map<Integer, String>list = new HashMap<>();
        list.put(11, "Vienuolika");
        list.put(12, "Dvylika");
        list.put(13, "Trylika");
        list.put(14, "Keturiolika");
        list.put(15, "Penkiolika");

        System.out.println(list);
        Map<String, Integer> map = task.convertMyMap(list);
        task.printMap(map);
            }

   private Map<String, Integer> convertMyMap(Map<Integer, String>list) {
       Map<String, Integer> newMap = new HashMap<>();
       for (Map.Entry<Integer, String> entry : list.entrySet()) {
           newMap.put(entry.getValue(), entry.getKey());
       }
       return newMap;
   }
        private void printMap(Map<String, Integer> map) {
            for(Map.Entry<String, Integer> entry: map.entrySet()){
                System.out.println(entry.getKey() + entry.getValue());

            }
       }
        private void printMapKeys(Map<String, Integer>map){
        for(String key: map.keySet()){
            System.out.println(key);
        }
   }

    }

