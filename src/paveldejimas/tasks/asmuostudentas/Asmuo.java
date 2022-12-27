package paveldejimas.tasks.asmuostudentas;
//asmuo + studentas
public class Asmuo {
    private final String name;
    private final String surname;

    public Asmuo(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString(){
        return String.format(name + surname);
    }

}

