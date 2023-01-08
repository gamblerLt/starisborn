package kartojimas.testrev;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;

public class DataLaikas {
    public static void main(String[] args) {

        LocalDateTime datatime = LocalDateTime.now();

      System.out.println("Dabar yra: " + datatime.toLocalDate());
      System.out.println("Dabar yra: " + datatime.toLocalTime());

        LocalTime time = LocalTime.now();



        System.out.println("Pridejus 30 min : " + time.plusMinutes(30));

        System.out.println("time: " + time);

        System.out.println("time: " + time.plusHours(2));

        System.out.println("time: " + time);

        System.out.println("time: " + time.minusSeconds(10));

       System.out.println(time);

        time = time.plusMinutes(30);
        System.out.println(time);

        time = time.plusHours(2);
        System.out.println(time);

        time = time.minusHours(1);
        System.out.println(time);


        LocalDate date = LocalDate.now();
        System.out.println(date);

        date = date.plusYears(10);
        System.out.println(date);

        date = date.plusMonths(6);
        System.out.println(date);

        date = date.minusDays(3);
        System.out.println(date);
    }
}
