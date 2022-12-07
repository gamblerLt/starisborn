package task;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        // pasimti masyva
        ArraySum arraySum = new ArraySum();
        int[] mas = arraySum.fillUpMas();

        System.out.println("suma" + arraySum.sumArray(mas));

    }

    //1
    private int[] fillUpMas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek elementu ivesite");
        int length = sc.nextInt();

        //kuriam masyva

        int[] mas = new int[length];

        for(int i = 0; i < mas.length; i++){
            System.out.println("Iveskite tu elementu skaiciu:" + i + 1);
            mas[i] = sc.nextInt();
        }
        return mas;
    }
private  int sumArray(int[] mas) {
        int sum = 0;
        for(int i = 0; i < mas.length; i++){
            sum+=mas[i];
        }
        return  sum;
}
//private double arrayAverage neuzbaigiau, sitas skaiciuoja vidurki naudodanais jau aprasyta suma
}
