package paveldejimas.taskasdi;

public class Darbuotojas extends  Asmuo{
    protected String socDraudimoNr;

    public Darbuotojas(String vardas, String pavarde, String asmensKodas, String socDraudimoNr) {
        super(vardas, pavarde, asmensKodas);
        this.socDraudimoNr = socDraudimoNr;
    }

    public String getSocDraudimoNr() {
        return socDraudimoNr;
    }

    public void setSocDraudimoNr(String socDraudimoNr) {
        this.socDraudimoNr = socDraudimoNr;
    }
}
