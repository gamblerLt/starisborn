package collection;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Koordinate {

    public String toString() {
        return "X: "+this.x+" "+"Y: "+this.y;
    }
    public static void main(String[] args) {

        List<Koordinate> coordinates = new ArrayList<>();
        coordinates.add(new Koordinate(1, 5));
        coordinates.add(new Koordinate(5, 9));
        coordinates.add(new Koordinate(4, 0));
        coordinates.add(new Koordinate(0, 0));
        coordinates.add(new Koordinate(9, 1));
        coordinates.add(new Koordinate(2, 5));

        System.out.println(coordinates.toString());

        //System.out.println(Arrays.asList());
        /*
        String list = coordinates.toString();

        System.out.println(list);*/

        /*System.out.println(coordinates.get(x).toString());
        System.out.println(coordinates.get(y).toString());*/
        //pakeisti indeksa 4 - 0, 0:
     /*   coordinates.remove(3);
        coordinates.add(2, new Koordinate(1, 1));
        System.out.println(Arrays.asList());*/

    }

    private static int x;
    private static int y;

   /* public Koordinate(int x, int y){
        this.x = x;
        this.y = y;
    }*/

    public Koordinate(int x, int y) {
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
    }

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


    }




/*
1 - Sukurti klasę Koordinate, kuri turi private kintamuosius x ir y

2 - sukurti  konstruktorių, priimanti du parametrus ir getterius/setterius

3 - Sukurti sąrašą, kuris saugo Koordinate tipo elementus +++

4 - Į sąrašą įdėti kelis elementus (pvz sarasas.add(new Koordinate(2, 5));)

5 - Kordinatės: (1; 5), (5; 9), (4; 0), (0; 0), (9; 1), …

6 - Atspausdinti koordinates

7 - Rasti kelinta sąraše yra (0; 0) koordinatė

8 - Pakeisti šio (0; 0) objekto koordinates į (1; 1)

9 - Atspausdinti koordinates
*/
