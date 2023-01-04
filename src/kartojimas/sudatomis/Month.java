/*
package kartojimas.sudatomis;

import java.time.format.DateTimeParseException;
import java.util.zip.DataFormatException;

public enum Month {

    JANUARY(1, "January", "01", 31),
    FEBRUARY(1, "February", "02", 28),
    MARCH(1, "March", "03", 31),
    APRIL(1, "April", "04", 30),
    MAY(1, "May", "05", 31),
    JUNE(1, "June", "06", 30),
    JULY(1, "July", "07", 31),
    AUGUST(1, "August", "08", 31),
    SEPTEMBER(1, "September", "09", 30),
    OCTOBER(1, "October", "10", 31),
    NOVEMBER(1, "November", "11", 30),
    DECEMBER(1, "December", "12", 31);

    private final int id;
    private final String name;
    private  final  String number;
    private final int days;

    Month(int id, String name, String number, int days) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.days = days;
    }

    public  static  Month getMonth(int id, int days) throws DateFormatException{
        for (Month m: Month.values()) {
            //if(m.getId()==id){
                if(days < 1 || days > m.days) throws DateFormatException {
            }
                return m;
            }
        }
        //jei kas bus negerai, gaudom, todel uzkomentuoju returna. dabar sakykim i
        // vede 13 menesi ir reikia ismesti klaida

        throw new DateFormatException();

       // return  null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public int getDays() {
        return days;
    }
}
*/
