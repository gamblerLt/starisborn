package collection;

import task.MinMaxArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColStr {
    public static void main(String[] args) {



        List<String> text = new ArrayList<>();
        int arrSize = text.size();
        System.out.println(arrSize);
        if(arrSize >= 5){
            text.clear();



        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite savo varda:");
        text.add(sc.nextLine());
        System.out.println("Iveskite brolio varda:");
        text.add(sc.nextLine());
        System.out.println("Iveskite sesers varda:");
        text.add(sc.nextLine());
        System.out.println("Iveskite mamos varda:");
        text.add(sc.nextLine());
        System.out.println("Iveskite tevo varda:");
        text.add(sc.nextLine());
        System.out.println("Iveskite senelio varda:");
        text.add(sc.nextLine());
        System.out.println("Iveskite senelio varda:");
        text.add(sc.nextLine());
        System.out.println("Iveskite senelio varda:");
        text.add(sc.nextLine());

            System.out.println("Dydis" + arrSize);

        print(text);

    }


}


    private static void print(List<String> text) {

    text.forEach(System.out::println);
    }
}
