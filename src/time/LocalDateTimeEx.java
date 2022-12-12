package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.plusYears(20));
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonthValue());
        //System.out.println(localDateTime.isAfter(localDateTime));
        System.out.println(localDateTime.atZone(ZoneId.systemDefault()));

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy.MM.dd")));


    }
}
