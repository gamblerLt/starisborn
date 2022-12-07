package task;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveArrElement {
    public static void main(String[] args) {
        int[] mas = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Kuri elementa norite ismesti");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        RemoveArrElement remove = new RemoveArrElement();
        remove.removeArrayItem(mas, index);
        System.out.println("Isimtas: "+ Arrays.toString(mas));
    }
    private void removeArrayItem(int[] mas, int index){
        int tempIndex = 0;
            for (int i = 0; i < mas.length; i++){

                if(i == index){

                    ++i;
                }
                mas[tempIndex] = mas[i];

            }
        }

}
