package kartojimas;

public class CounterChild extends Counter {
    public static void main(String[] args) {


        CounterChild child = new CounterChild();
        child.cnt();
        //child.thirdPrint();


    }
 public void cnt() {
        int i = 5;
        int increment = i++;
        System.out.println("Vaikinio rezultatas: " + i);
    }
/*@Override

    public  void thirdPrint(){

        System.out.println("Cia yra private print is vaiko");
    }*/
}




