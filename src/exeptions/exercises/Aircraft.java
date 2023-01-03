package exeptions.exercises;

import java.util.Random;

public class Aircraft {

    public static void main(String[] args) {
        Plain plain = new Plain();
        plain.lowerGear();
        plain.lowerGear();
        plain.lowerGear();
        plain.lowerGear();
        plain.lowerGear();
        plain.lowerGear();

    }

}
class Plain {
    public void lowerGear(){
        Random random = new Random();
        int x = random.nextInt(10);
        try {
            int i = 4 / x; // / by 0
            if ( x == 5) {
                "I am flying".charAt(20);
            }
            System.out.println("Ok, the landing gear ir lowered!");

        }catch (ArithmeticException arEx) {

            System.out.println("/0 Gear not lowering");

        }catch (StringIndexOutOfBoundsException strEx){

            System.out.println("ERROR. Unable to lower gear for unknown reason");

        }finally {

            System.out.println("OK");
        }

    }

}