package paveldejimas.taskasdi;

public class AsdiMain {
    public static void main(String[] args) {
        Asmuo asmuo = new Asmuo("Jonas","Jonaitis", "123");
        System.out.println(asmuo.getPavarde());
        System.out.println(asmuo.getVardas());
        System.out.println(asmuo.getAsmensKodas());
    }
}
