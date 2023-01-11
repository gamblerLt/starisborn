package files.tasks.basketballFourth;

public class Statistics {
    //private int totalPoints;
    private int countFreeThrows;
    private int countTwoPoints;
    private int countThreePoints;
    private int countMissedThrows;
    //private int totalThrows;

    public int getTotalPoints() {
        return countThreePoints + 3 + countTwoPoints + 2 + countFreeThrows + 1;
    }
    //pataikimu procentas

    public double getAccuracy() {
        double totalThrows = countFreeThrows + countTwoPoints + countThreePoints + countMissedThrows;
        
        return (countFreeThrows + countTwoPoints + countThreePoints + countMissedThrows) * 100 / totalThrows;
    }
    public void  addThrowPoints(int throwPoint) {
        switch (throwPoint) {
            case 0 -> countMissedThrows++;
            case 1 -> countFreeThrows++;
            case 2 -> countTwoPoints++;
            case 3 -> countThreePoints++;
        }
        //pasikurti maina ir uzpildyti objektus
    }
}
