package collection;

import java.util.ArrayList;
import java.util.List;

public class ThirdByAn {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rimas");
        names.add("Jurgita");
        names.add("Vejas");
        names.add("Milda");
        names.add("Upe");

        String w = "";
        for(String name: names){
            if(name.length() > w.length()){
                w = name;
            }
        }
        System.out.println("Ilgiausias zodis: " + w);
    }
}
