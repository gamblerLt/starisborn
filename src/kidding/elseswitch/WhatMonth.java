package kidding.elseswitch;

import java.util.Scanner;

public class WhatMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite menesio skaiciu: ");
        int month = sc.nextInt();
        //int month = 6;
        String monthName;

        switch (month){
            case 1 -> monthName = "Sausis";
            case 2 -> monthName = "Vasaris";
            case 3 -> monthName = "Kovas";
            case 4 -> monthName = "Balandis";
            case 5 -> monthName = "Geguze";
            case 6 -> monthName = "Birzelis";
            case 7 -> monthName = "Liepa";
            case 8 -> monthName = "Rugpjutis";
            case 9 -> monthName = "Rugsejis";
            case 10 -> monthName = "Spalis";
            case 11 -> monthName = "Lapkritis";
            case 12 -> monthName = "Gruodis";
            default -> monthName = "Grigaliaus klaendoriuje yra tik 12 menesiu ;) ";

        }
        System.out.println("Jus ivedete " + month + " ir tai yra " + monthName + " !");
    }
}
