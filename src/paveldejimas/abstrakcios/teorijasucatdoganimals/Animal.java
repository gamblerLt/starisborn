package paveldejimas.abstrakcios;

public abstract class Animal {
    // tai abstrakcios klases antraste ir neturi turinio arba kitaip tariant neturi body.

    public abstract  void  makeSound();
    public abstract int getAge();
    public void info(){
        System.out.printf("Animal ages is:  %s%n", getAge());
        //

    }
}
