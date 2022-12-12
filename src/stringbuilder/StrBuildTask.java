package stringbuilder;

public class StrBuildTask {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Liepa Antradienis");
        System.out.println(stringBuilder.delete(5, 6));
        System.out.println(stringBuilder.reverse());
        //System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.delete(0, 5));
        System.out.println(stringBuilder.delete(4, 6));
        System.out.println(stringBuilder.delete(5,7));
        System.out.println(stringBuilder.delete(6,7));

        System.out.println(stringBuilder.replace(3, 6, "2022"));
        System.out.println(stringBuilder.insert(3, "om "));
        System.out.println(stringBuilder.length());

    }
}
