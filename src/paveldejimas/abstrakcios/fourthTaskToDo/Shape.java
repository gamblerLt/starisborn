package paveldejimas.abstrakcios.fourthTaskToDo;

public abstract  class Shape {
    private final double perimeter;
    private final double area;

    public Shape(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }
   public void printPerimeterArea(){
       System.out.println("Perimetras " + perimeter + " plotas " +area);

   }
}
