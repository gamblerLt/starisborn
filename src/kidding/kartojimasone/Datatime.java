package kidding.kartojimasone;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datatime {
    public static void main(String[] args) {

        LocalDateTime laikas = LocalDateTime.now();
        System.out.println(laikas.getHour());
        System.out.println(laikas.minusHours(3));
        System.out.println(laikas.plusDays(5));

        LocalDate siandien = LocalDate.now();
        String formatuotaSiandien = siandien.format((DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(formatuotaSiandien);
        DateTimeFormatter formatuota = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        formatuotaSiandien = siandien.format(formatuota);
        System.out.println("Data: " + formatuotaSiandien);

    }
}

/*Užduotis 1
• Susikurti LocalDateTime objektą su dabarties data ir laiku
• Atimti 3 valandas
• Pridėti 5 dienas
• Atspausdinti formtu “yyyy MM dd HH:mm”*/

/*LocalDate siandien = LocalDate.now(); // 2018-07-09
String formatuotaSiandien = siandien.format(DateTimeFormatter.BASIC_ISO_DATE);
System.out.println(formatuotaSiandien); // 20180709
DateTimeFormatter formateris = DateTimeFormatter.ofPattern("yyyy!!MM!!dd");
formatuotaSiandien = siandien.format(formateris);
System.out.println(formatuotaSiandien);*/