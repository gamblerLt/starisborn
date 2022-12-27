package paveldejimas.abstrakcios.trainingtwo;

public abstract class Person {
    private final String name;
    private final  String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract  void  printInfo();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
