package kartojimas.sudatomis;

public class Student extends Person{

    private final String univercity;
    private  final String nr;

    public Student(Date date, String name, String univercity, String nr) {
        super(date, name);
        this.univercity = univercity;
        this.nr = nr;
    }

    public  void printUnivercity(){
        System.out.println();
    }

}



/*Sudarykite klasę Student,
kuri paveldi klasę person ir papildo bent vienu
kintamuoju ir bent vienu metodu (sugalvokite patys).*/