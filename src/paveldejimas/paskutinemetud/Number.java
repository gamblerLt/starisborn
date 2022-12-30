package paveldejimas.paskutinemetud;

import java.util.ArrayList;
import java.util.List;

public abstract class Number {
    //kuriam lista
    protected final List<Integer>numbers;

    protected final int minInterval;
    protected final int maxInterval;
    protected  final int maxGenNumb;

    public Number(int minInterval, int maxInterval, int maxGenNumb) {
        this.minInterval = minInterval;
        this.maxInterval = maxInterval;
        this.maxGenNumb = maxGenNumb;
        numbers = new ArrayList<>();
    }

    public  abstract  void generate();

    public int sum() {
        int sum = 0;
//int sum = numbers.stream().reduce(0, Integer::sum);

//skaiciuojame listo elementu suma
        for (Integer numb : numbers) {
            sum += numb;
        }
        return sum;
    }
}

