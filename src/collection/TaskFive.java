package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaskFive {
    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        arr.add("Lavestas1");
        arr.add("Ivestas2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite zodi");
        arr.add(sc.nextLine());
        System.out.println("Visi zodziai liste:\n" + arr);



        List<String> findWord = arr
                .stream()
                        .filter(x -> x.contains("Ivestas2"))
                                .collect(Collectors.toList());
        System.out.println("Zodi radau: " + findWord);
        /* arr.indexOf(findWord);
        System.out.println(findWord);*/

        String rm;
        System.out.println("Koki zodi norite istrinti?" + arr);
        rm = sc.nextLine();
        arr.remove(rm);

        System.out.println("Jusu ivesta zodi istryniau. like zodziai" + arr);





        arr.clear();
        System.out.println("Sarasas istrintas, likusios reiksmes: " + arr);
        System.out.println("Dydis" + arr.size());



    }
}

/*
* List<String> result = list
                .stream()
                .filter(x -> x.contains("Java"))
                .collect(Collectors.toList());

        System.out.println(result);*/

/*
1 - įvesti žodį - leidžia įvesti žodį, kuris išsaugomas į sąrašą
2 - rasti žodį - randa žodį ir atspausdina kelintas jis yra sąraše - nepavyko kelintas sarase
3 - trinti žodį - paklausia, kokį žodį ištrinti ir jį ištrina
4 - išvalyti sąrašą
5 - baigti programą
* */