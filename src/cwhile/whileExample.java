package cwhile;

public class whileExample {
    public static void main(String[] args) {
        int i = 0;
        // tikrina ir jei true, atlieka veiksma,
        while (i < 5) {
            System.out.println(":8");
            i++;

        }
        //do while atlieka veiksma ir tikrina ar kartoti
        //int sk = 2;

        do {
            System.out.println(i);
        } while(i < 5);
        i++;

    }
}