package cwhile;
import java.util.Random;
public class RandomExercise {
    public static void main(String[] args) {

        int[] mas = {5, 10, 15};

        Random random = new Random();
        int a = random.nextInt(100) + 1;
        int b = random.nextInt(100) + 1;
        int c = random.nextInt(100) + 1;



        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("Maksimalusskaicius: " + Math.max(a, c));

    }

    }

