package time;

import java.time.LocalDateTime;

public class TaskDate {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
       //String result = localDateTime.minusHours(3);

        System.out.println(localDateTime);
        System.out.println(localDateTime.plusYears(3));
        System.out.println(localDateTime.minusYears(5));
    }
}
