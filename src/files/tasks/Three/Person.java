package files.tasks.Three;

import java.io.Serializable;

public class Person implements Serializable {
    private final int id;
    private final String name;
    private final String surname;
    private int receivedMoney;
    private int sentMoney;


    public Person(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getReceivedMoney() {
        return receivedMoney;
    }

    public void setReceivedMoney(int receivedMoney){
        this.receivedMoney = receivedMoney;
    }

    public int getSentMoney() {
        return sentMoney;
    }

    public void setSentMoney(int receivedMoney) {
        this.receivedMoney = receivedMoney;
    }

}


