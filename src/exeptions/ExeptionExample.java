package exeptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExeptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int value = scanner.nextInt();
            System.out.println(value);
        } catch (InputMismatchException e) {
            System.out.println("Nezinoma klaida");
        }
        ExeptionExample example = new ExeptionExample();
        try {
            example.testExeption();
        } catch (Exception e) {
            System.out.println("jsdbvka");
        } finally {
            System.out.println("finally kviecamas visada, nes kai programa pastringa rasom pvz svaner close");
            scanner.close();
        }

        try {
            System.out.println(scanner.nextInt());
        } catch (NullPointerException e) {

        } catch (NoSuchElementException e) {

        } catch (RuntimeException e) {

        } catch (Exception e) {
        }
        //kostimizuota klaida
        try {
            example.testCustomExeption();
        } catch (CustomExeption e) {
            System.out.println("Custom exeption");
        }



    }
        private void testExeption () throws Exception {
            //meata klaida su throw zodeliu. turime ideti i try catck bloka arba mesti toliau,
            // todel prisideda zodelis throws - checked exeptiom arba compile exeption
            throw new Exception("this is exeption");
        }

        //unchecked exeption arba runtime exeption - tai naudojama, kai nera kritine klaida, pvz  kai vartotojas praleidzia ka
        //nors ivesti ir programa del to neturetu sustoti
        private void testRuntimeExeption () {
            throw new RuntimeException("This is runtimeexeption");

        }
        private  void testCustomExeption() throws CustomExeption {
        throw new CustomExeption();
        }
    }

