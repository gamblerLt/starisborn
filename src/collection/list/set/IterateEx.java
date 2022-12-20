package collection.list.set;

import java.util.HashSet;
import java.util.Iterator;

public class IterateEx {
    public static void main(String[] args) {
        HashSet<String> vaisiai = new HashSet<>();
        vaisiai.add("Obuoliai");
        vaisiai.add("Kriauses");
        vaisiai.add("Slyvos");
        vaisiai.add("Vysnios");

       /* I iteravimo budas printina true
       Iterator<String> iteratorius = vaisiai.iterator();
        while (iteratorius.hasNext()){
            System.out.println(iteratorius.hasNext());
        }*/

        // II iteravimo budas printina seto reiksmes

        for(String temp: vaisiai){
            System.out.println(temp);
        }
    }
}
