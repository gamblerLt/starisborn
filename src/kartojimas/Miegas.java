package kartojimas;

public class Miegas {

    private  boolean isWorkDay;
    private  boolean isHolyDay;

    private  boolean canSleep() {
        return !isHolyDay || isWorkDay;


    }


    public static void main(String[] args) {
        Miegas miegas = new Miegas();
        miegas.isHolyDay = false;
        miegas.isWorkDay = true;
        System.out.println("Ar galime miegoti: " + miegas.canSleep());
        miegas.isWorkDay = false;
        System.out.println("Ar galime miegoti: " + miegas.canSleep());


       /* int day = 2;
        switch (day){
            case 1 :
                System.out.println("Galima miegoti");
                break;
            case  2 :
                System.out.println("Negalima miegoti");
                break;
            default:
                System.out.println("O taip reikia poilsio");
        }*/



    }

}
