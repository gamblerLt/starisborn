package task;

public class FindWord {

    public static void main(String[] args){
        String text = "Vienas kitą sutikę, sakome labas";

        if (text.indexOf("labas")!= -1){
            System.out.println("Šis žodis yra.");
        }else{
            System.out.println("Šio žodžio nėra.");
        }

    }
}
