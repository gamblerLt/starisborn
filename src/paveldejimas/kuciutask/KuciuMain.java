package paveldejimas.kuciutask;

public class KuciuMain {
    public static void main(String[] args) {
        Asmuo asmuo = new Asmuo("Antanas", "Antanaitis");
        asmuo.getPavarde();
        asmuo.getVardas();

        System.out.println(asmuo.getPavarde());
        System.out.println(asmuo.getVardas());

        System.out.println(asmuo);

    }
}
