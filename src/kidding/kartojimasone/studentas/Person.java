package kidding.kartojimasone.studentas;

public record Person(String name, String surname, String town) {
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}
