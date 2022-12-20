package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HmapTaskOne {
    public static void main(String[] args) {
        HmapTaskOne taskOne = new HmapTaskOne();
        taskOne.mapTask();
       // taskOne.System.out.println(HashMap<Integer, String> number = new HashMap<>());




    }
    private void mapTask(){
        HashMap<Integer, String> number = new HashMap<>();
        number.put(1, "Vienas");
        number.put(2, "Du");
        number.put(3, "Trys");
        number.put(4, "Keturi");
        number.put(5, "Penki");


        System.out.println(number.entrySet());
        System.out.println(number.keySet());
        System.out.println(number.containsKey(4));
        System.out.println(number.containsValue(10));

        Set set = number.entrySet();
        Iterator iterator = set.iterator();
        while ((iterator.hasNext())) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("Key is " + mentry.getKey() + " & value is " + mentry.getValue());


        }


    }
}
