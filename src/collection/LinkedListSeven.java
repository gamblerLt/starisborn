package collection;

import java.util.LinkedList;

public class LinkedListSeven {
    public static void main(String[] args) {
        LinkedList<String> months = new LinkedList<>();
        months.add("Sausis");
        months.add("Vasaris");
        months.add("Kovas");
        months.add("Balandis");
        months.add("Gegužė");
        months.add("Birželis");
        months.add("Liepa");
        months.add("Rugpjūtis");
        months.add("Rugsėjis");
        months.add("Spalis");
        months.add("Lapktritis");
        months.add("Gruodis");

        System.out.println("Mėnesių sąrašas: \n" + months);

        //pol firs ir poll last parodo pirma ir paskutini elementus juos istrinant
        months.pollFirst();
        months.pollLast();
        System.out.println("Ispolintas 1 ir paskutinis" + months);

        String first = months.get(0);
        String last = months.get(months.size()-1);
        System.out.println("Pirmas ir paskutinis yra: \n" + first + " ir " + last);
        System.out.println("Likęs listas (tikrinu ar neištrynė): \n" + months);

        /*String fs = months.lastIndexOf;
        System.out.println(fs);*/

        System.out.println();

        months.addFirst("Pirmas");
        months.addLast("Paskutinis");

        System.out.println("+Firs+Last: \n" + months);

        months.removeFirst();
        months.removeLast();

        System.out.println("-Firs-Last: \n" + months);

        months.remove(0);
        months.add(0, "January");
        System.out.println("Pakeistas 0 indeksas Sausis - > January\n:" + months);

        String month = months.poll();
        System.out.println("Pol ištraukia (ištrindamas) pirmą elementą iš sąrašo: " + month);
        System.out.println("Likęs sąrašas: " + months);

        String monthPolFirst = months.pollFirst();
        System.out.println("Pol first: \n" + monthPolFirst);
        System.out.println("Tikrinu sarasa: \n" + months);
        months.add(0, "January");
        months.add(1,"February");
        System.out.println("Prideti Jan ir Feb: \n" + months);

        // push n pop

        months.push("Kovas");
        System.out.println("Push kovas: \n" + months);

        String monPop = months.pop();
        System.out.println("Pop: \n" + monPop);
        System.out.println("Kas liko po pop: \n" + months);


    }

}
