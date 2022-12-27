package paveldejimas.vaisiai;

public class FruitMain {
    public static void main(String[] args) {
        Mangas mangas = new Mangas();
        mangas.kasAsEsu();

        Obuolys obuolys = new Obuolys();
        obuolys.kasAsEsu();//jeigu obuoli uzkomentuosiu at atspausdins aukstesni hierarchijoje

        System.out.println(mangas instanceof Mangas);

    }
}
