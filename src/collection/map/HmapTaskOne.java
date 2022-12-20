package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HmapTaskOne {
    public static void main(String[] args) {
        HmapTaskOne taskOne = new HmapTaskOne();
        taskOne.mapTask();

       // taskOne.printMap;




    }
    private void mapTask(){
        HashMap<Integer, String> number = new HashMap<>();
        number.put(1, "Vienas");
        number.put(2, "Du");
        number.put(3, "Trys");
        number.put(4, "Keturi");
        number.put(5, "Penki");


        System.out.println("HasMap (number): " + number);
        System.out.println("entrySet: " + number.entrySet());
        System.out.println("keySet: " + number.keySet());
        System.out.println("containsKey pvz ->(4): " + number.containsKey(4));
        System.out.println("containsValue pvz-> (10): " + number.containsValue(10));

        Set set = number.entrySet();
        Iterator iterator = set.iterator();
        while ((iterator.hasNext())) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("Key is " + mentry.getKey() + " & value is " + mentry.getValue());

            //mapTask.printMap(number);


        }
//2 uzduotis


        }
        private void printMap(Map<Integer, String> map){
        for(Integer key: map.keySet()){
            System.out.println(key + map.get(key));
        }


    }
}
