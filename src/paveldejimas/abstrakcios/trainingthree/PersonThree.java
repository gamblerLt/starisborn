/*
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

    @Override
    public String toString() {
        return super.toString();
    }

    public boolean isValuesUnique(List<PersonThree> persons){
        List<PersonThree> uniquePersons = new ArrayList<>();
        for (PersonThree p: persons){
            if(!uniquePersons.contains(p)){
                uniquePersons.add(p);
            }
        }
        return  persons.size() == uniquePersons.size();
    }
}
*/
