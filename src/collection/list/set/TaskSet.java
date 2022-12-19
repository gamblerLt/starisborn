package collection.list.set;

import java.util.HashSet;
import java.util.Set;

public class TaskSet {
    public static void main(String[] args) {
        TaskSet task = new TaskSet();
        task.hashSetTask();


    }
    private void hashSetTask(){
        Set<String> colors =new HashSet<>();
        colors.add("Raudona");
        colors.add("Geltona");
        colors.add("Oranzine");
        colors.add("Zalia");

       // colors.forEach(System.out::println);
        System.out.println("Aibes reiksmes: " + colors);
        System.out.println("Aibes dydis: " + colors.size());
        System.out.println(colors.contains("Zalia"));
        System.out.println(colors.contains("Juoda"));


        if(colors.contains("Zalia")){
            colors.remove("Zalia");
        }
        System.out.println(colors);
        colors.clear();
        System.out.println(colors);
        }



        //clear nespejau




    }

