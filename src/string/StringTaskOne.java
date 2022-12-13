package string;

public class StringTaskOne {
    public static void main(String[] args) {
        String name = "Petras";
        String  surname = "Petraitis";
        float height = 1.933f;
        int age = 100;
        String text = String.format("Asmens %s %s, amzius %d m. ir jo ugis yra %.2f m", name, surname, age, height);
        System.out.println(text);

        text = String.format("|%20s|%n|%20s", "Zodis", "Kitas zodis");
        System.out.println(text);
        System.out.println("Labas \t \t \t vakaras\nLabas vakaras\\Labas vakaras");
    }
}
