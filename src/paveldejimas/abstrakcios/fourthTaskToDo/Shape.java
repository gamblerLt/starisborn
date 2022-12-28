package paveldejimas.abstrakcios.fourthTaskToDo;

public abstract  class Shape {
    private final double perimeter;
    private final double area;

    public Shape(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }
   public void printPerimeterArea(){
       System.out.println("Perimetras" + perimeter + area);//??
   }
}
/*
* public abstract class Transport {
    private final LocalDate registrationDate;
    private final String color;

    public Transport(LocalDate registrationDate, String color) {
        this.registrationDate = registrationDate;
        this.color = color;
    }
    public void printRegistrationDate(){
        System.out.println(registrationDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
    public String getColor(){
        return color;
    }
    public abstract void go();
}*/