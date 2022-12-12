package time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TaskInputTime {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite laika: ");
        String userInput = sc.next();

        LocalTime localTime = LocalTime.parse(userInput, DateTimeFormatter.ofPattern("HH:mm"));
        localTime = localTime.plusHours(3);

        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");

       // LocalTime time = LocalTime.parse(userInput);

        System.out.println(userInput);
        System.out.println("Pridejus valanda, bus: " + userInput);
    }
}
