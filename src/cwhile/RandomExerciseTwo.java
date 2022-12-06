package cwhile;

import java.util.Random;

public class RandomExerciseTwo {
    public static void main(String[] args) {
        int[] mas = new int[3];
        Random random = new Random();

        int max= 0;

        for(int i =0; i < mas.length; i++){
            mas[i] = random.nextInt(100) + 1;
            System.out.println(mas[i]);
            if(mas[i] > max){
                max = mas[i];
        }

    }
    System.out.println(max);
}
}

