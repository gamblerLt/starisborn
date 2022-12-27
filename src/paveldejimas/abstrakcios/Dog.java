package paveldejimas.abstrakcios;

public class Dog extends  Animal{

    private final int age;

    public Dog(int age) {
        this.age = age;
    }


    @Override
    public void makeSound() {
        System.out.printf("Loja");

    }

    @Override
    public int getAge() {
        return age;
    }
}
