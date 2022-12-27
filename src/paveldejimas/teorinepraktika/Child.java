package paveldejimas.teorinepraktika;

public class Child extends Parent{
    public static void main(String[] args) {
        Child child = new Child();
        child.print();
        child.secondPrint();
        child.test();

        System.out.println(child.sum(25, 40));
    }
    private  void test(){
        System.out.println("Test");
    }
    @Override
    public  void  print() {
        System.out.println("Sveiki, cia yra child");
    }
    @Override
    public  void secondPrint(){
        super.secondPrint();
    }
    @Override
    public int sum(int a, int b){
        return super.sum(a,b) * 5;
    }
}
