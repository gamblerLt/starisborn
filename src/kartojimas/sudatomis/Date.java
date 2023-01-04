package kartojimas.sudatomis;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date  {
    private int year;
    private int month;
    private int day;


    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void set(int year, int month, int day) {
        this.year = year;

        if (month >= 1 && month <=12){
            System.out.println("Tokio menesio nera");
            return;
        }

        if (day >= 1 && day <=31){
            System.out.println("Tokios dienos nera");
            return;
        }
    }

    public  void print() {

        System.out.println(year + "-" + month + "-" + day);

    }

}


/*Sudarykite klasę Date, kurią sudaro
trys int tipo nariai datos
metams,
mėnesiui ir
dienai saugoti,

metodas void set(int, int, int),

klasės kintamiesiems priskiriantis parametrais nurodytas reikšmes
(patikrinkite ar nurodytos reikšmės gali būti interpretuojamos kaip mėneio ar dienos numeriai)
ir metodas void print(), atspausdinantis datą formatu YYYY-MM-DD.
 */