package paveldejimas.abstrakcios.trainingtwo;

public class ManTwotask {
    public static void main(String[] args) {
       Person student = new Student("Petras", "Studentauskas");
       student.printInfo();
       Person lecturer = new Lecturer("Profesorius", "Kaledauskas");
        lecturer.printInfo();
    }
}

