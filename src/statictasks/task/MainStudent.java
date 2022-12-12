package statictasks.task;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student(1, "Rimas", 45);
        Student secondStudent = new Student(2, "Algis", 28);
        System.out.println(student);
        System.out.println(secondStudent);
       // System.out.println(student.getId());
        student.setName("Naujas vardas");
        System.out.println(student);

    }
}
