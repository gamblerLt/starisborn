package task;
import java.util.Arrays;
import java.util.stream.*;
import java.io.*;
import java.util.Scanner;
public class Andrew {
    public static void main(String[] args) {
        int n;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite masyvo elemento skaičių: ");

        //reading the number of elements from the that we want to enter
        n = scanner.nextInt();

        //creates an array in the memory of length 10
        int[] array = new int[10];
        System.out.println("Iveskite masyvo elementus: ");
        for (int i = 0; i < n; i++) {
            //reading array elements from the user
            array[i] = scanner.nextInt();
        }
        System.out.println("Masyvo elementai yra šie: ");

        // accessing array elements using the for loop
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);


               int sum = Arrays.stream(array).sum();
                System.out.println("The sum is " + sum);



           }
        }
    }











