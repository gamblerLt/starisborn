package paveldejimas.abstrakcios.trainingtwo;

public class Student extends Person{

    public Student(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void printInfo() {



        System.out.println(this);
    }

}
