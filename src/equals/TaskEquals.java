package equals;

public class TaskEquals {
    public static void main(String[] args) {
        String zodis1 = "Zodis";
        String zodis2 = "Zodis";
        System.out.println(zodis1.equals(zodis2));
        System.out.println(zodis1==zodis2);

        String zodis3 = new String("zodis");
        String zodis4 = new String("zodis");
        System.out.println(zodis3.equals(zodis4));
        System.out.println(zodis3==zodis4);

        zodis3 = zodis4;
        System.out.println(zodis3.equals(zodis4));
        System.out.println(zodis3==zodis4);


        String zodis5 = "vardas";
        String zodis6 = "pavarde";

        System.out.println(zodis5.equals(zodis6));
        System.out.println(zodis5==zodis6);

        zodis5 = zodis6;
        System.out.println(zodis5.equals(zodis6));
        System.out.println(zodis5==zodis6);


    }
}
