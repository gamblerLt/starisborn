package kartojimas.testrev;

import kartojimas.Counter;

public class CounterChild extends Counter {
    public static void main(String[] args) {

        CounterChild child = new CounterChild();
       // child.cnt();
        child.thirdPrint();

        /* Child child = new Child();
        child.print();
        child.secondPrint();
        child.test();*/

    }
/*public void cnt() {
        int i = 5;
        int increment = i++;
        System.out.println("Vaikinio rezultatas: " + i);
    }*/
@Override

    public  void thirdPrint(){

        System.out.println("Cia yra private print is vaiko");
    }
}



