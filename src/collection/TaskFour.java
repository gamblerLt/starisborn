package collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskFour {
    public static void main(String[] args) {

        List<String> fourtText = new ArrayList<>();
        fourtText.add("Farsas");
        fourtText.add("Kotletas");
        fourtText.add("Cepelinas");
        fourtText.add("Bulves");
        fourtText.add("Kotletas");

        System.out.println(fourtText);
        Set<String> podu = new LinkedHashSet<String>(fourtText);
        System.out.println(podu);

        }
    }

/*
*Parašyti programą, kuri turi sąrašą su keletu String tipo
elementų ir pašalina iš sąrašo vienodus elementus, jei jų yra.
**/