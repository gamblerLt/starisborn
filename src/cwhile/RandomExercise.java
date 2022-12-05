package cwhile;
import java.util.Random;
public class RandomExercise {
    public static void main(String[] args) {

        RandomExercise task = new RandomExercise();

        int[] mas = {5, 10, 15};

//ieskau max reiksmes


        Random random = new Random();
        int a = random.nextInt(100) + 1;
        int b = random.nextInt(100) + 1;
        int c = random.nextInt(100) + 1;

        int max = task.getMax(mas);
        System.out.println("MAksimalusskaicius: " + max);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    private int getMax(int[] mas) {
        int max = mas[a];
        for (int i = 1; i < mas.length; i++) {
            int value = mas[i]; // nebutinas sita eilue
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        return max;
    }
}
