package collection.map;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        MapExample example = new MapExample();
        example.hashMapExample();
        example.linkedHashMap();

    }
    private void hashMapExample(){
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Petras");
        names.put(2, "Algis");
        names.put(3, "Jonas");
        names.put(4, "Jokubas"); //atnaujina reiksme pagal key

        System.out.println(names.get(2));

        for(Integer key : names.keySet()){
            System.out.printf("%s-%s", key, names.get(key));
        }

        names.keySet().forEach(key ->System.out.printf("%s-%s-%n", key, names.get(key)));

    }
    private void linkedHashMap(){
        Map<String, Double> prices = new LinkedHashMap<>();
        prices.put("Jogurtas", 45.5);
        prices.put("Batonas", 1.5);
        prices.put("Alus", 1.8);

        System.out.println("--------------------");
        prices.forEach((k, v) ->System.out.printf("%s-%s%n", k, v));
    }
    private void treeMapExample(){

    }
}
