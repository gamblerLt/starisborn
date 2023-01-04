package kartojimas.sudatomis;

public class Person{

    private Date date;

    private String name;

    public Person(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

}


/*
* Sudarykite klasę Person,
* kurią sudaro klasės Date objektas asmens gimimo metams saugoti
* ir kintamasis asmens vardui saugoti.*/