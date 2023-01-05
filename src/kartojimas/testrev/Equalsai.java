package kartojimas.testrev;

public class Equalsai {
    public static void main(String[] args) {
        String a = "Pamoka";
        String b = "Pamoka";
        String c = new String ("Pamoka");
        int x = 5;
        int y = 5;

        int z = 4;

        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(100 == 100);
        System.out.println(x == y);
        System.out.println("Ar a equals c " + a.equals(c));
        System.out.println( z == x);

        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");


        System.out.println("*************************************");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true

        System.out.println("************************");

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;

        String h1 = new String("GEEKS");
        String h2 = new String("GEEKS");

        System.out.println(t1 == t3);
        System.out.println(t1 == t2);
        System.out.println(h1 == h2);

        System.out.println(t1.equals(t2));
        System.out.println(h1.equals(h2));

    }
}
