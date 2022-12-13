package methods;

public class MethTaskThree {
    public static void main(String[] args) {
        metOne(20, 20);
    }
    private static void  metOne(int x, int y){
        if(x > y){
            System.out.println("x daugiau uz y");

        } else if (x < y) {
            System.out.println("x maziau uz y");

        }else {
            System.out.println(x*y);
        }

    }
}
