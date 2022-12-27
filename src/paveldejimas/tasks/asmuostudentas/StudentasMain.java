package paveldejimas.tasks.asmuostudentas;

public class StudentasMain {
    public static void main(String[] args) {
        Studentas studentas = new Studentas("Rimas", "Spakauskas", "ID-5654565", "VPU");
        System.out.println(studentas.getId());
        System.out.println(studentas.getUniversity());
        System.out.println(studentas.getSurname());
        System.out.println(studentas.getName());
        System.out.println(studentas);

        Asmuo asmuo = new Asmuo("Jonas", "Jonaitis");

        System.out.println(asmuo.getName());
        System.out.println(asmuo.getSurname());
        System.out.println(asmuo);

        Asmuo secondStudent = new Studentas("Jonas", "Jonaitis", "id-5585555", "kjhy");
        System.out.println(secondStudent.getSurname());
        System.out.println(secondStudent.getName());
        System.out.println(secondStudent);

        //cia yra patikrinimas ty kestinimas:
        if(secondStudent instanceof  Studentas st){
            System.out.println(st.getId());
            System.out.println(st.getUniversity());
        }


    }

}
