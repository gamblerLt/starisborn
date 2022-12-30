package paveldejimas.abstrakcios;

public class MainAnimal {
    public static void main(String[] args) {
       // Animal animal = new Animal();

        Dog dog = new Dog(15);

        int age = dog.getAge();
        dog.makeSound();
        dog.info();

        Animal animal = new Cat(5);
        age = animal.getAge();
        animal.makeSound();
        animal.info();

        //Animal objekto be klasess sukurti negalima, todel kuriamos anonimines klases klases:

        Animal animal2 = new Animal() {
            @Override
            public void makeSound() {

            }

            @Override
            public int getAge() {
                return 100;
            }
        };

        animal2.makeSound();
        animal2.info();

    }
}
