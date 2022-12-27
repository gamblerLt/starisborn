package paveldejimas.taskasdi;

public class Studentas extends Asmuo{
    protected String studentoPAsNr;

    public Studentas(String vardas, String pavarde, String asmensKodas, String studentoPAsNr) {
        super(vardas, pavarde, asmensKodas);
        this.studentoPAsNr = studentoPAsNr;
    }

    public String getStudentoPAsNr() {
        return studentoPAsNr;
    }

    public void setStudentoPAsNr(String studentoPAsNr) {
        this.studentoPAsNr = studentoPAsNr;
    }
}
