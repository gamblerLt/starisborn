package collection.map;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        MapExample example = new MapExample();
        example.hashMapExample();
        example.linkedHashMap();
        example.treeMapExample();

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

        Map<Integer, String >names = new TreeMap<>();
        names.put(3, "Jonas");

        for(Integer key: names.keySet()){
            System.out.println(key); //cia nespejau parsyti, turi buti 1 eiluteje
            System.out.println(names.get(key));

        }
      /*  Map<User, Integer>users = new TreeMap<>();
        users.put(new User(5,"Jonas")50);
        users.put(new User(5,"Jonas")50);
        users.put(new User(5,"Jonas")50);
        users.put(new User(5,"Jonas")50);
        users.forEach((k, v) -> System.out.println(k + v); //reikia overaidinti ->.>>>> user.java

        */


    }
}
