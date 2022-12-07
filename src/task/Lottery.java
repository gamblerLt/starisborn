/*
package task;

import java.util.Arrays;
import java.util.Scanner;

*/
/*
/Parasykite programa, kuri nustato ar loterijos bilietas yralaimingas.
/Loterijos bilieto 6 zenklis numeris laikomas laimingu, jeigu jo pirmuju triju skiciu suma
/lygi paskutiniu triju skaiciu sumai.
/Bilieto numeri perduokite komandineje eiluteje. pvz 968745
 *//*

public class Lottery {
    public static void main(String[] args) {

        int[] array = new int[6];
//1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite sesiazenkli loterijos bilieto skaiciu:");
        String line = scanner.nextLine();

        //tikrinu ar tikrai 6 zenklis skaicius
        if (line.length() != 6) {
            System.out.println("neteisingas numeris");
            return;
        }
        //iskvieciamas metodas
        Lottery task = new Lottery();
        if(task.hasDuplicateNumbers(line)){
            System.out.println("Skaiciai kartojasi");
        }

    }

    private boolean hasDuplicateNumbers(String lottoNumb) {
        //ar skaiciai yra skirtingi pgl salyga, tikriname dubliktus, perbega per skaicius

        for (int i = 0; i < lottoNumb.length(); i++) {
            for(int j = i + 1; j < lottoNumb.length(); j++){
                if(lottoNumb.charAt(i) == lottoNumb.charAt(j)){
                    return true;
                }
            }

        }
        return false;
    }
    private boolean isWinner(String lottoNumber){
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < lottoNumber.length() / 2; i++){
            firstSum+= Character.getNumericValue((lottoNumber.charAt(i)));
            secondSum+=Character.getNumericValue(lottoNumber.charAt((lottoNumber.charAt()))) // cia nebaigiau ir dar auksciau kazkoki b pridejo
        }
    }

}*/
