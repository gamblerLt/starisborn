package collection;
//sitas neina kazkodel
import java.util.ArrayList;
import java.util.List;

public class TaskFourAn {
    public static void main(String[] args) {

        List<String> wegetables = new ArrayList<>();
        wegetables.add("Morka");
        wegetables.add("Bulve");
        wegetables.add("Kopustas");
        wegetables.add("Krapai");
        wegetables.add("Bulve");

        System.out.println(wegetables);
    }

    private List<String> getUniqueWords(List<String> wegetables) {
        List<String> uniqueWords = new ArrayList<>();
        for (String wegetable : wegetables) {
            if (!uniqueWords.contains(wegetable)) {
                uniqueWords.add(wegetable);

            }
        }
        return wegetables;

    }
}