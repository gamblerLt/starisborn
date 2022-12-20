package collection.list.set;

public record Student(String name, String surname, String university) {

    @Override // cia kas bus atspausdinta, galima keisti
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
