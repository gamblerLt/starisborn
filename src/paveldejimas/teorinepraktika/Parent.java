package paveldejimas.teorinepraktika;

public class Parent {
    public void print(){

        System.out.println("Labas, cia Parent print");
    }
    public int sum(int a, int b){

        return a + b;
    }
    protected void secondPrint(){

        System.out.println("O cia secondprint protected, kuria paveldi vbikines klases");
    }
    private  void thirdPrint(){

        System.out.println("Cia yra private print");
    }
}
