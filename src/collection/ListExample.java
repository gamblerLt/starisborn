package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        //ArrayList
        //negali buti primityvai, turi buti klase pvz intrher
        //sitas yra vaikinis tipas:

        ArrayList<Integer> numbers = new ArrayList<>();
        //tevinis tipas naudojamas dazniau:
        List<Integer> numbers2 = new ArrayList<>();

        //LinkedList

        LinkedList<Integer> numbers3 = new LinkedList<>();
        List<Integer> numbers4 = new LinkedList<>();

        List<Integer> thirdNumbers = List.of(1, 5, 8, 9, 15);

        numbers3.getFirst();
        numbers3.getLast();


        printCollection(numbers);
        printCollection(numbers2);
        printCollection(numbers3);
        printCollection(numbers4);


    }
    private static  void printCollection(List<Integer> numbers){
        numbers.forEach(System.out::println);
    }
}
