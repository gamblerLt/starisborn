package collection.list.set;

public class Cat implements  Comparable<Cat>{
    private final String name;
    private final int age;

    public  Cat(String name, int age)
    {
        this.name = name;
        this.age = age;

    }
//desinis klavisas, generate, tostring


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return o.name.compareTo(name);
        //return o.name.compareTo(o.name);
    }
}
//2 val 12 min kazka dar sukure
/*
* @Override
	public boolean equals(Object o) {
		if(this == o)
		{
			return true;
		}
		if(o == null || getClass() != o.getClass())
		{
			return false;
		}
		Cat cat = (Cat) o;
		return age == cat.age && name.equals(cat.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public String toString() {
		return "Cat{" +
			   "name='" + name + '\'' +
			   ", age=" + age +
			   '}';
	}

	@Override
	public int compareTo(Cat o) {
		if(name.equals(o.name)) {
			if(age == o.age) {
				return 0;
			}
			return age > o.age ? 1 : -1;
		}
		return name.compareTo(o.name);*/