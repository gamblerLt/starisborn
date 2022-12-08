package statictasks.task;

public class FirstTask {
    private  int i;

    void setValue(int i){
        System.out.println(i);
        this.i = i;
    }
    void staticMethod(int j){
       // i = j; nestatinis todel negalima priskirti reiksm4s
        System.out.println(j);
    }
}
