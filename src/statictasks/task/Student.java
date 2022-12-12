package statictasks.task;

public class Student {
    //private - nepasiekiami kitoms klasems, o final kad nebutu galima pakeisti
    private final int id;
    private String name;
    private final int age;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

//desinys klavisas generate > getter

    public int getId() {
        return id;
    }

    public String getName() {
        return name;

    }

    public int getAge() {
        return age;
    }
    //reikia seterio
    public  void setName(String name){
        this.name = name;
    }
    //desinis klavisas, generate, overide, toString - norint pakeisti objekta
//overaidina ir atprintiuna
    @Override
    public String toString() {
        //return String.format("id: %s, name %s, age: %s, id, name, age");
        return String.format(id + name + age);
    }
}
