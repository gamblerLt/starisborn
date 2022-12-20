package kidding.elseswitch;

import java.util.Scanner;

public class WhatNum {



    public static void main(String[] args) {
        int numIn;
        String result;
      //  WhatNum num = new WhatNum();
       // num.cond();

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        numIn = sc.nextInt();

        result = numIn > 0 ? "Daugiu uz nuli": "maziau uz nuli";
        System.out.println(result);

       /* if(numIn > 0){
            result = "Daugiau uz 0";
        } else if (numIn == 0) {
            result = "Ivedete nuli";
        } else{
            result = "Ivedete neigiama skaiciu";
    }
        System.out.println(result);*/

    /*public void cond(){
        if(numIn > 0){
            System.out.println("Daugiau uz 0");
        } else if (numIn == 0) {
            System.out.println("Ivedete nuli");
        } else{
            System.out.println("Ivedete neigiama skaiciu");

        }*/
    }
}
