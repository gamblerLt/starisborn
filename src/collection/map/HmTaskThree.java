package collection.map;

import java.util.HashMap;

public class HmTaskThree {
    public static void main(String[] args) {
       HmTaskThree taskThree = new HmTaskThree();
        taskThree.thirdTask();

    }
    private void thirdTask(){
        HashMap<Integer, String>list = new HashMap<>();
        list.put(11, "Vienuolika");
        list.put(12, "Dvylika");
        list.put(13, "Trylika");
        list.put(14, "Keturiolika");
        list.put(15, "Penkiolika");

        System.out.println(list);




    }
   /* private void rev(HashMap<String, Integer> HashMap){
        System.out.println(list);*/

    }

