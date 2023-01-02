package paveldejimas.paskutinemetud.suskaiciaisevedodd;

import java.util.Random;

public class NegativeNumber extends Number{

    public NegativeNumber(int minInterval, int maxInterval, int maxGenNumb) {
        super(minInterval, maxInterval, maxGenNumb);
    }
    @Override
    public  void generate(){
        Random random = new Random();
        for (int i = 0; i < maxGenNumb; i++) {
            int randoNumb = random.nextInt(minInterval, maxInterval + 1) * -1;
            numbers.add(randoNumb);
        }
    }
}


