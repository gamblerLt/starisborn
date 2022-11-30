package theory;

import java.sql.SQLOutput;

public class EnumEx {
    //konstantu kurimas
   // private static final String DEVELOPER_NAME = "gamblerLt";
    private static final String MONDAY = "Pirmadienis";


    public  static void main(String[] args) {
        System.out.println(MONDAY);
        System.out.println(Week.SUNDAY);
        System.out.println(Week.BLACKDAY.getName());
        System.out.println(Week.BLACKDAY.getNumber());

    }
    }

