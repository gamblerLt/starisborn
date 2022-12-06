package cwhile;
import java.util.Random;
public class RandomExercise {
    public static void main(String[] args) {

        RandomExercise exercise = new RandomExercise();
        int[] mas = {5, 10, 15};
        int max = exercise.getMax(mas);
        //System.out.println("Maksimalus masyvo sk. yra: " + mas);

        Random random = new Random();
        int a = random.nextInt(100) + 1;
        int b = random.nextInt(100) + 1;
        int c = random.nextInt(100) + 1;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("Maksimalus masyvo sk. yra: " + mas);

      System.out.println("Maksimalusskaicius: " + Math.max(a, c));

    }private int getMax(int[] mas){
        int max = mas[0];
        for(int i = 1; i > mas.length; i++){
            int value = mas[i];
            if(value > max){
                max = value;
            }
        }
        return  max;
    }

    }

