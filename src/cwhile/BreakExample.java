package cwhile;

public class BreakExample {
    public static void main(String[] args) {
        int[] mas = {1, 3, 5, 6, 7, 8, 9};
        int numb = 0;
        for(int i = 0; i< mas.length; i++){
            if(mas[i] == 5){
                numb = mas[i];
                break;
            }
            System.out.println(mas[i]);
        }
        System.out.println("Rezultatas " + numb);


    }
}
