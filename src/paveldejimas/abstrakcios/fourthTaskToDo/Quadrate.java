package paveldejimas.abstrakcios.fourthTaskToDo;

public class Quadrate extends  Shape{
    private final double quadPerimeter;
    private final double quadArea;

    public Quadrate(double perimeter, double area, double quadPerimeter, double quadArea) {
        super(perimeter, area);

        this.quadPerimeter = quadPerimeter;
        this.quadArea = quadArea;


    }

    public double getQuadPerimeter() {
        return quadPerimeter();
    }

    @Override
    public void  quadPerimeter() {
        System.out.println("Kvadrato perimetras apskaičiuojamas a * a");
    }
}
/*
* public class Truck extends  Transport {
    private final double maxWeight;

    public Truck(LocalDate registrationDate, double maxWeight, String color){
        super(registrationDate, color);
        this.maxWeight = maxWeight;

    }

    public  double getMaxWeight(){
        return  maxWeight;
    }
    @Override
    public void go(){
        System.out.println("Sunkvezimis vaziuoja");
    }

}
*/