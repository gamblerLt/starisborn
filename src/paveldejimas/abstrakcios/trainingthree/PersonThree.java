package paveldejimas.abstrakcios.trainingthree;

import java.util.ArrayList;
import java.util.List;

public abstract class PersonThree {

    private final String name;
    private final  String surname;

    public PersonThree(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract void printInfo();

    @Override
    public String toString() {
        return String.format("name: %s, surname %s", name, surname);
    }

    public boolean isValuesUnique(List<PersonThree> persons){
        List<PersonThree> uniquePersons = new ArrayList<>();
        for (PersonThree p: persons){
            if(uniquePersons.contains(p)){
                return  false;
            }
            uniquePersons.add(p);
        }
        return true;
    }
}

