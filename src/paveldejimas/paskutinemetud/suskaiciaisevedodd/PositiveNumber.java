package paveldejimas.paskutinemetud.suskaiciaisevedodd;

import java.util.Random;

public class PositiveNumber extends Number {

    public PositiveNumber(int minInterval, int maxInterval, int maxGenNumb) {
        super(minInterval, maxInterval, maxGenNumb);
    }

    @Override
    public void generate() {
//reikia uzpildyti lista teigiamais skaiciais atsitiktiniais
        Random random = new Random();
        for(int i = 0; i < maxGenNumb; i++) {
                int randNumb = random.nextInt(minInterval, maxInterval + 1 );
                numbers.add(randNumb);
        }

    }
}

