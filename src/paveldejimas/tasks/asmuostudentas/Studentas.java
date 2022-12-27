package paveldejimas.tasks.asmuostudentas;

public class Studentas extends Asmuo {
    private final String id;
    private final String university;

    public Studentas(String name, String surname, String id, String university) {
        super(name, surname);
        this.id = id;
        this.university = university;
    }

    public String getId() {
        return id;
    }

    public String getUniversity() {
        return university;
    }

    // @overide
    public  String toString(){
        return String.format(id + university);
    }
}
