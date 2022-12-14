package collection;

import java.util.ArrayList;
import java.util.List;

public class SimpleMy {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(100);
        num.add(200);
        num.add(300);

        print(num);
    }
    private  static  void print(List<Integer> num){
        num.forEach(System.out::println);

        Integer remove = num.remove(2);
        System.out.println("Salina skaiciuojant nuo 0 - nulio: pasalino" + remove);

        /*
        * //remove by index
		Integer remove = numbers.remove(2);
		System.out.println("removed " + remove);
        * */

    }
}
