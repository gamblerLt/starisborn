package statictasks.task;

public class TwoPislave {
    public static void main(String[] args) {
        TwoPislave task = new TwoPislave();
        float radius = task.calcRadius(99.9f);

        System.out.println(radius);
    }
    private float calcRadius(float radius){
        return  (float) (2 * Math.PI * radius);

    }





}
