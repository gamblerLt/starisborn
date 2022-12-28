package paveldejimas.abstrakcios.fourthTaskToDo;

import java.sql.SQLOutput;

public class MainShape {
    public static void main(String[] args) {
        Shape k = new Quadrate(5+5+5+5,5*5);
        Shape a = new Circle(2*3.14*8,3.14*(8*8));

        System.out.println("Kvadratos duomenys: ");
        k.printPerimeterArea();
        System.out.println("Apskritimo duomenys: ");
        a.printPerimeterArea();
    }
}
