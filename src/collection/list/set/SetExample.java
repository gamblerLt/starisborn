package collection.list.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        SetExample example = new SetExample();
        example.hashSetExample();
        example.linkedHashSet();
        example.treeSet();

    }

    private void hashSetExample() {
        Set<String> names = new HashSet<>();

        names.add("Jomas");
        names.add("Petras");
        names.add("Algis");
        names.add("Kazys");
        names.add("Edita");
        names.forEach((System.out::println));

        Set<Cat> cats = new HashSet<>();
       // Set<Cat> cats = new HashSet<>(Collections.reverseOrder);
        cats.add(new Cat("Rainiis", 15));
        cats.add(new Cat("aRainiis", 45));
        cats.add(new Cat("cRainiis", 55));
        cats.add(new Cat("uRainiis", 5));
        cats.forEach(System.out::println);

        }

    private void linkedHashSet(){
        Set<String> cars = new LinkedHashSet<>();
        cars.add("BMW");
        cars.add("Audi");

        cars.forEach(System.out::println);
    }

    private void treeSet(){
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(2);
        numbers.forEach(System.out::println);

        Set<Cat> cats = new TreeSet<>();
        // Set<Cat> cats = new HashSet<>(??????Reverse);
        cats.add(new Cat("Rainiis", 15));
        cats.add(new Cat("aRainiis", 45));
        cats.add(new Cat("cRainiis", 55));
        cats.add(new Cat("uRainiis", 5));
        cats.forEach(System.out::println);

        cats.forEach(System.out::println);


    }
}