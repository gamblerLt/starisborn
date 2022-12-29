package paveldejimas.paskutinemetud.ensurancetask;

public class Main {
    public static void main(String[] args) {

        Insurance kasko = new KaskoInsurance("Rimas",300,"LT","kkk555",225);
        Insurance tpvca = new TPVCAInsurance("Simas",700,"ES","kkk852");

        System.out.println(kasko.getInsuredPerson() + kasko.getSum());
        System.out.println(tpvca.getInsuredPerson()+ tpvca.getCountry());

        System.out.println(((CarInsurance)kasko).getCarNumber());
        System.out.println(((CarInsurance)tpvca).getCarNumber());

        if (kasko instanceof KaskoInsurance insurance) {
            System.out.println(insurance.getFranchise());

        }

    }
}
