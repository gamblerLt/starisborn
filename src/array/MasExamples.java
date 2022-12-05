package array;

public class MasExamples {
    public static void main(String[] args){


        // masyvus galima sukurti 3 budais

        int[] mas = new int[10];
        int another [] new int [10]; //sito nenaudoti
        int[] thirdMass = {0, 1, 2, 3}; // sitas naudojamas kai jau tikrai zinai reiksmes ir nelabai naudojamas

        System.out.println(thirdMass[2]); // atspausdins trecia reiksme
        System.out.println(thirdMass[thirdMass.length - 1]); // parodys paskutine reiksme

        //masyvui priskirsime reiksme:

        mas[2] = 0;

    }
}
