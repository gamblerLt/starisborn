package kartojimas.testrev;

public class RevRep {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Pamoka");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.replace(0,1, "2018");
        System.out.println(stringBuilder);
    }
}
