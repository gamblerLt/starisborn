package cwhile;
import  java.util.Scanner;
public class TaskDoWhile {

    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numb;

        do{
            System.out.println("Iveskite");
            numb = scanner.nextInt();
            if(numb > 10 && numb < 15){
                System.out.println("blogas ivedimas");
            }

        }while(numb > 0);
    }


}
