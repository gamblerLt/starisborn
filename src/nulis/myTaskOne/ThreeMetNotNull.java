package nulis.myTaskOne;

public class ThreeMetNotNull {
    public static void main(String[] args) {
        Metodas me = new Metodas();
        me.meMe();

        Skaiciai sk = new Skaiciai();
        sk.suma(2,8,6);

    }
}
class Metodas {
    public void meMe() {
        System.out.println("Metodas meme skviestas");
    }
}
class Skaiciai{
    public int suma(int a, int b, int c) {
        int suma = a + b + c;
        System.out.println(suma);
        return suma;

}
}
