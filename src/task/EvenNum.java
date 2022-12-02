package task;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įveskite skaičių");
        int num = sc.nextInt();

        if(num <= 0){
            System.out.println("Jūs įvedėte 0 arba neigiamą skaičių: " + num);

        } else if (num % 2 == 1) {
            System.out.println("Jūsų įvestas skaičius yra nelyginis: " + num);

        }else{
            System.out.println("Jūsų įvestas skaičius yra lyginis: " + num);
        }

    }

}

