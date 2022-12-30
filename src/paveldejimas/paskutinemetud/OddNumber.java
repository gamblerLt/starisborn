package paveldejimas.paskutinemetud;

import java.util.Random;

public class OddNumber extends Number{
    public OddNumber(int minInterval, int maxInterval, int maxGenNumb) {
        super(minInterval, maxInterval, maxGenNumb);
    }
    @Override
    public void generate(){
        Random random = new Random();
        while ((numbers.size()<=maxGenNumb)) {
            int randomNumb = random.nextInt(minInterval, maxInterval +1);
            numbers.add(randomNumb);
        }
    }
}


