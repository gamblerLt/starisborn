package paveldejimas.paskutinemetud.ensurancetask;

public class KaskoInsurance extends CarInsurance{
    private final double franchise;

    public KaskoInsurance(String insuredPerson, double sum, String country, String carNumber, double franchise) {
        super(insuredPerson, sum, country, carNumber);
        this.franchise = franchise;
    }

    public  double getFranchise(){
        return franchise;
    }
}
