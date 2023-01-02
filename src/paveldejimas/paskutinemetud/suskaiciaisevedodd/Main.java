package paveldejimas.paskutinemetud.suskaiciaisevedodd;

public class Main {
    public static void main(String[] args) {
       Main main = new Main();

       Number number = new PositiveNumber(20, 200, 50);
       main.run(number);

       Number evenNumb = new EvenNumber(10, 500, 100);
       main.run(evenNumb);

       OddNumber oddNumber = new OddNumber(10, 100, 20);
       main.run(oddNumber);

       NegativeNumber negativeNumber = new NegativeNumber(50,100,20);
       main.run(negativeNumber);

    }
    private void run(Number number) {
        number.generate();
        System.out.println("Suma: " + number.sum());
    }
}
