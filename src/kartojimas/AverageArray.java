package kartojimas;

public class AverageArray {

    public static void main(String[] args) {

        int[] array = {2, 34, 65, 70};

        AverageArray avg = new AverageArray();
        System.out.println(avg.average(array));
    }

    private double average(int[] array) {

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;


    }
}
/*	private double average(int[] mas) {

}*/