package paveldejimas.abstrakcios.trainingthree;

public class TeacherThree extends PersonThree{


    public TeacherThree(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void printInfo() {
        System.out.println(this);
    }
}

