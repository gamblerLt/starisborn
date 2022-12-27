package paveldejimas.kuciutask;

public class Asmuo {
    private final String vardas;
    private final String pavarde;

    public Asmuo(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;


    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }
            @Override
    public String toString(){
        return String.format("Asmuo %s %s", vardas, pavarde);
            }

}
