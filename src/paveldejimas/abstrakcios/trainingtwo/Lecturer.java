package paveldejimas.abstrakcios.trainingtwo;

public class Lecturer extends Person{
    public Lecturer(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }
}
