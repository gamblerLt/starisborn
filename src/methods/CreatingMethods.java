package methods;

public class CreatingMethods {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = minFunction(a, b);
        System.out.println(c);
        System.out.println(Math.max(a, b));

    }

    private static int minFunction(int a, int b) {
        int min;
        if (a > b)
            min = b;
         else
            min = a;
            return min;


        }
    }




