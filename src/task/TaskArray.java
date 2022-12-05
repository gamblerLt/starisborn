package task;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskArray {
    public static void main(String[] args) {
        TaskArray task = new TaskArray();
        int[] mas = task.fillMass();

        int max = task.getMax(mas);
        System.out.println("MAksimalusskaicius: " + max);

        double average = task.getArrayAverage(mas);
        System.out.println(average);

        int powSum = task.powSum(mas);
        System.out.println(powSum);
    }

    private int[] fillMass() {
        Scanner sc = new Scanner(System.in);

        //int length = getCorrectNumber(sc, "Iveskite elementu skaiciu");

        int[] mas = new int[3]; // ar sitas nesipjauna???
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Įvestkite 3 skaičius:" + i++);
            mas[i] = sc.nextInt();

        }
        return mas;

    }

    private int getMax(int[] mas) {
        int max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            int value = mas[i]; // nebutinas sita eilue
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        return max;

    }
    private  double getArrayAverage(int[] mas){
        int sum = 0;
        for(int i = 0; i < mas.length; i++){
            sum += mas[i];

        }
        return sum / mas.length;
    }

    private int powSum( int[] mas){
        int sum = 0;
        for(int i = 0; i < mas.length; i++){
            sum+= Math.pow(mas[i], 2); // cia 2 yra kelimas kvadratu

        }
        return sum;

    }
}