package collection;
import java.util.ArrayList;
import java.util.List;


class Iksy {

    private int x;
    private int y;

    Iksy(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public String toString() {
        return "X reiksme: " + this.x  + "  -  " + "Y reiksme: " + this.y;
    }
}

public class Koordinate {
    public static void main(String[] args) {

        ArrayList<Iksy> coordinates = new ArrayList<Iksy>();
        coordinates.add(new Iksy(1, 5));
        coordinates.add(new Iksy(5, 9));
        coordinates.add(new Iksy(4, 0));
        coordinates.add(new Iksy(0, 0));
        coordinates.add(new Iksy(9, 1));
        coordinates.add(new Iksy(2, 5));

       // coordinates.add(5, new Iksy(10,100));
        coordinates.remove(5);
        coordinates.add(5, new Iksy(50,50));
        for(Iksy koord: coordinates){
            System.out.println(koord);
            //System.out.println(coordinates.size());

            /*
            * For (Iksy kord : coordinates){
System.out.println(coordinates.indexOf(kord) +1)
Kord.setx(1);
Kord.setY(1);
Break;
}*/

        }

    }
}

        //pakeisti indeksa 4 - 0, 0:
     /*   coordinates.remove(3);
        coordinates.add(2, new Koordinate(1, 1));
        System.out.println(Arrays.asList());*/


   /* public Koordinate(int x, int y){
        this.x = x;
        this.y = y;
    }*/

   /* public Koordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }*/

    /*Koordinate listas = new Koordinate();

    public Koordinate getListas() {
        return listas;
    }*/

 //   @Override
    /*public String toString() {
        return toString();*/
        //return "x" + x + "y" + y;
        //return this.getX() + " + " + this.getY();
        /*
        * @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", population=" + population +
                '}';
    }*/


/*
1 - Sukurti klas?? Koordinate, kuri turi private kintamuosius x ir y

2 - sukurti  konstruktori??, priimanti du parametrus ir getterius/setterius

3 - Sukurti s??ra????, kuris saugo Koordinate tipo elementus +++

4 - ?? s??ra???? ??d??ti kelis elementus (pvz sarasas.add(new Koordinate(2, 5));)

5 - Kordinat??s: (1; 5), (5; 9), (4; 0), (0; 0), (9; 1), ???

6 - Atspausdinti koordinates

7 - Rasti kelinta s??ra??e yra (0; 0) koordinat??

8 - Pakeisti ??io (0; 0) objekto koordinates ?? (1; 1)

9 - Atspausdinti koordinates
*/
