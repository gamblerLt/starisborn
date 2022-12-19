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