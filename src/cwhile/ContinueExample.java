package cwhile;

public class ContinueExample {
    public static void main(String[] args) {
        int[]
                mas = {1, 3, 5, 6, 7, 8, 9};
        for(int i =0; i < mas.length; i++){
            if(mas[i] <=5){
                continue;
            }
            System.out.println(mas[i]);



        }


    }
}
