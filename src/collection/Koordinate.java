package collection;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Koordinate {
    public static void main(String[] args) {

        List<Point> points = new ArrayList<>();
        points.add(new Point(2,5));
        points.add(new Point(0,0));
        points.add(new Point(1,5));
        points.add(new Point(5,9));
        points.add(new Point(4,0));
        points.add(new Point(9,1));

        System.out.println();

            int x;
            int y;

            List<Coordinates> coordinates = new ArrayList<>();
            coordinates.add(new Coordinates(0, 0));
            coordinates.add(new Coordinates(1, 5));

        }


}

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
