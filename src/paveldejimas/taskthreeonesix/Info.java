package paveldejimas.taskthreeonesix;

public class Info {
    int id;
    String text;

    public Info(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
    String isInText = "Some text here"; //gali buti kazkoks inputas
    boolean isIn = isInText.indexOf(text) != -1 ? true : false;

}
/*@Override
	public String toString() {
		return String.format("name: %s, surname: %s", name, surname);
	}

	public boolean isValuesUnique(List<Person> persons) {
		List<Person> uniquePersons = new ArrayList<>();

		for(Person p : persons) {
			if(uniquePersons.contains(p)){
				return false;
			}
			uniquePersons.add(p);
		}

		return true;
zemiau prasideda uzkomentuotos kelios eilutes:
		for(Person p: persons) {
			if(!uniquePersons.contains(p)) {
				uniquePersons.add(p);
			}
		}
		return persons.size() == uniquePersons.size();

uzkomentuotu eiluciu pabaiga. Toliau tesiais kodas.

	}

	@Override
	public boolean equals(Object o) {
		if(this == o)
		{
			return true;
		}
		if(o == null || getClass() != o.getClass())
		{
			return false;
		}
		Person person = (Person) o;
		return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, surname);
	}
}
*/