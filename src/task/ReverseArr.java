package task;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] mas = {12, 13, 14, 15, 16, 17, 18,19};
       // int[] ar ={2, 6,19};
        for(int i = 0; i < mas.length / 2; i++){
            int temp = mas[i];
            mas[i] = mas[mas.length - 1 - i];
            mas[mas.length - 1 - i] = temp;
          //  ArrayUtils.reverse(ar);

        }
        System.out.println(Arrays.toString(mas));

    }

}
/*
String[] array = {"A", "B", "C", "D", "E"};
ArrayUtils.reverse(arr);
System.out.println(Arrays.toString(arr)); //[E, D, C, B, A]
 */