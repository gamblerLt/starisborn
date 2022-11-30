package theory;

public enum Week {
    MONDAY("Pirmadienis", 1),
    TUESDAY("Atradienis", 2),
    WEDNESDAY("Treciadienis", 3),
    THURSDAY("Ketvirtadienis", 4),
    FRIDAY("Penktadienis", 5),
    SATURDAY("Sestadienis", 6),
    SUNDAY("Sekmadienis", 7),
    BLACKDAY("Juodadienis", 8);
    private final String name;
    private final int number;

    private Week(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
