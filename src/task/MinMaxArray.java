package task;
/*
/surasti min max reiksmes is masyvo
 */
public class MinMaxArray {
    public static void main(String[] args) {
        int[] mas = {4, 5, 6, 9, 8, 9, 10};
        MinMaxArray array = new MinMaxArray();


        System.out.println(array.maxArrayValue(mas));
        System.out.println(array.minArrayValue(mas));


    }

    private int maxArrayValue(int[] mas) {  //paduodame masyva
        int max = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];

            }
        }
        return max;

    }

    private int minArrayValue(int[] mas) {  //paduodame masyva
        int min = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        return min;
    }
}