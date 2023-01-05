package kartojimas.testrev.paveldejimas.abc;

import paveldejimas.paskutinemetud.thirdtask.B;

public class Test {

    public static void main(String[] args) {
       ClassA obj = new ClassA();
       ClassB obj2 = new ClassB();
       MuseCeCe muse = new MuseCeCe();
       obj.metodas();
       obj2.metodas();
       muse.metodas();
    }
}


/*// Driver class
class Main {
    public static void main(String[] args)
    {
        // If a Parent type reference refers
        // to a Parent object, then Parent's
        // show is called
        Parent obj1 = new Parent();
        obj1.show();

        // If a Parent type reference refers
        // to a Child object Child's show()
        // is called. This is called RUN TIME
        // POLYMORPHISM.
        Parent obj2 = new Child();
        obj2.show();
    }
}*/