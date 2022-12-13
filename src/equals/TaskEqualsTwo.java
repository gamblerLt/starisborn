package equals;

public class TaskEqualsTwo {
    public static void main(String[] args) {
        String word1 = "Asmuo";
        String word2 = "Akmuo";
        System.out.println(word1==word2);
        System.out.println(word1.equals(word2));

        word1 = word2;
        String word3 = word2;
        System.out.println(word3==word1);
        System.out.println(word3.equals(word1));

        //Object t = new Tank();
        //Object p = new Person();
        //System.out.println(p.equals(t));
    }
}
