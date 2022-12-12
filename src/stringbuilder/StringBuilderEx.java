package stringbuilder;

public class StringBuilderEx {
    public static void main(String[] args) {
        String text = "Kazkas";
        text+= "tekstas antras";
        text = text + "dar teksto daugiau" + 50;
        System.out.println(text);

        StringBuilder stringBuilder = new StringBuilder("Builderio reiksme ");
        if(true){
            stringBuilder.append("tekstas ");
        }
        stringBuilder.append("").append(50).append(" ").append("!!!");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());

        System.out.println(stringBuilder.indexOf("rei")); // jeo neranda, grazina -1, siu atveju nerado, nes reversintas stringas
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.indexOf("rei"));
        System.out.println(stringBuilder.delete(0, 8));
        System.out.println(stringBuilder.insert(8, " - Baisiai daug teksto - "));
    }
}
