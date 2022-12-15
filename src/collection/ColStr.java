package collection;
/*
* •Sukurti String tipo elementus galintį saugoti sąrašą
•Vartotojas įvedinėja žodžius, kuriuos programa deda į
sąrašą
•Po įvedimo atspausdinamas visas sąrašas
• Jei sąrašo dydis tampa 5, tada sąrašas išvalomas ir toliau
dedama į tuščią sąrašą
• Jei dedant į sąrašą paaiškėja, kad toks elementas jau yra,
tada spausdinamas klaidos pranešimas ir toliau laukiama
kitų žodžių*/
import task.MinMaxArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColStr {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ColStr task = new ColStr();

        boolean isExist;
        do {
            System.out.println("Iveskite zodi");
            String line = sc.nextLine();
            isExist = line.equals("exit");

            if(!isExist) {
                task.addWord(words, line);
                System.out.println(words);
            }

        }while(!isExist);

    }
        private void addWord(List<String> words, String word) {
            if(words.size() == 5) {
                words.clear();
                return;
            }
            if(words.contains(word)){
                System.out.println("Klaida");
                return;

            }
            words.add(word);

        }

    }

