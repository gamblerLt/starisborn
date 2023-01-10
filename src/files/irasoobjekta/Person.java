package files.irasoobjekta;

import java.io.Serializable;
//serializable pasako ar objektas nepakito ka irasem i faila ir ka konvertavo atgal
public class Person implements Serializable {
    private final  String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
