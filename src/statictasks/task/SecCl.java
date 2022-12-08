package statictasks.task;

public class SecCl {

    static int count;

    SecCl(){
        System.out.println("Kintamojo reiksme" + count++);

    }

    static void cleanUp(){
        System.out.println("Pries valyma" + count);
        count = 0;


    }

}
