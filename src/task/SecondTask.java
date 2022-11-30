package task;

public class SecondTask {
    public static void main(String[] args) {
        int s = 6;

        if (s <= 0) {
            System.out.println("Netinkamas skaicius");
        } else if (s >= 13) {
            System.out.println("Netinkamas skaicius");
        } else if (s % 2 != 1) {
            System.out.println("Lyginis");

        } else {
            System.out.println("Nelyginis");
        }
        switch (s) {
            case 1 -> System.out.println("Sausis");
            case 2 -> System.out.println("Vasaris");
            case 3 -> System.out.println("Kovas");
            case 4 -> System.out.println("Geguze");
            case 6 -> System.out.println("Biržųūįųųėęįųęčūelis");
            case 7 -> System.out.println("Liepa");
            case 8 -> System.out.println("Rugpjutis");
            case 9 -> System.out.println("Rugsejis");
            case 10 -> System.out.println("Spalis");
            case 11 -> System.out.println("Lapkritis");
            case 12 -> System.out.println("Gruodis");
        }
    }
}
