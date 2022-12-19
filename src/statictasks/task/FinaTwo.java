package statictasks.task;

public class FinaTwo {
    private  int a;
    private  int b;

    void changeValues(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args) {
        FinaTwo myObject = new FinaTwo();
        System.out.println(myObject.a);
    }
}
