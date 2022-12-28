package paveldejimas.abstrakcios.trainingthree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maintrys {
    public static void main(String[] args) {
        PersonThree student = new StudentThree("Studentas", "Studentauskas");
        student.printInfo();

        PersonThree teacher = new TeacherThree("Profesorius", "Kaledauskas");
        teacher.printInfo();

        StudentThree secondStudent = new StudentThree("Studentas", "Studentauskas");
        List<PersonThree>persons = List.of(student, teacher, secondStudent);
        System.out.println(secondStudent.isValuesUnique(persons));
    }
}

