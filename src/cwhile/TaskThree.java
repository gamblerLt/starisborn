package cwhile;

import java.util.Random;

public class TaskThree {
    public static void main(String[] args) {
 // 3 uzduotis turi atlikti 100k bandymu sugeneruoti sk nuo 1 iki 10
 //ispausdinti rezultatus, kiek atsitiktinai buvo atsitiktinai paairinktas 1,2,...10

    int[] mas = new int[10];
        Random random = new Random();

    for(int i = 0; i < 100000; i++) {

       int numb = random.nextInt(10);
       mas[numb]+=1;

    }
    for(int i = 0; i < mas.length; i++){
            System.out.println("Count: " + i+1 + mas[i]);
        }
    }
}
