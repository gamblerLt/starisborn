package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaskThree {
    public static void main(String[] args) {
        List<String> someText = new ArrayList<>();
        someText.add("Jonas");
        someText.add("Sigismundas");
        someText.add("PatsilgiausiasvardasPasaulyje");

        System.out.println("Liste yra sie vardai: \n" + someText);

        String longestString = someText.
                stream()
                .max(Comparator.comparingInt(String::length))
                .get();
        System.out.println("Ilgiausias vardas yra: \n" + longestString);
        System.out.println("Ilgiausias vardas turi " + longestString.length() + " raides");

        int lengthOfString2 = someText
                .stream()
                .map(String::length)
                .max(Integer::compare)
                .get();
        System.out.println("Ilgiausias vardas turi tiek raidziu: \n" + lengthOfString2);

    }

}
