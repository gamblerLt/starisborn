package statictasks.task;

public class SecMain {
    public static void main(String[] args) {

        SecCl gask = new SecCl();
        System.out.println();
        new SecCl();
        new SecCl();
        new SecCl();
        new SecCl();
        new SecCl();

        System.out.println(SecCl.count);
        SecCl.cleanUp();
        System.out.println(SecCl.count);



    }
}
