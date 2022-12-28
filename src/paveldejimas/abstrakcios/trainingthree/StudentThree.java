package paveldejimas.abstrakcios.trainingthree;

public class StudentThree extends PersonThree{


    public StudentThree(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }
}

