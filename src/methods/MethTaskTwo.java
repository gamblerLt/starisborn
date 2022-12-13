package methods;

public class MethTaskTwo {
    public static void main(String[] args) {
        metas1("Vardas", "Pavarde", "Tautybe", 2022);
        metas2("Su", "Naujaisiais", 2023, "metais!");

    }
    private static void metas1(String name, String surname, String nation, int year){
        System.out.println(name + surname + nation + year);

            }
            private  static void metas2(String one, String two, int year, String three){
               // System.out.printf("Sveikinu, %s, %s, %s, %s");
                System.out.println(one + " " + two + " " + year + " " + three);
            }



}
