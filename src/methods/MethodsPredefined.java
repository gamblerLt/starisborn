package methods;

import java.util.Arrays;

public class MethodsPredefined {

        public static void main(String[] args) {

            String text1 = "Laba diena           ";
            String text2 = "Laba diena";
            String text3 = "Adios amygos";
            int a = 11;
            double b = 25.6;
            char z = 'Z';
            char v = '1';
            System.out.println(text1.compareTo(text2));
            System.out.println(text1.compareTo(text3));
            System.out.println(text2.compareTo(text3));
            System.out.println(text1.equals(text2));//true
            System.out.println(text2.equals(text3));//false
            System.out.println(text1.concat(text3));
            System.out.println(text1.charAt(1));//a
            System.out.println(text1.equalsIgnoreCase(text2));//true
            System.out.println(text1.equalsIgnoreCase(text3));//false
            System.out.println(text1.toUpperCase() + text3.toLowerCase());
            System.out.println(text1.trim());
            System.out.println(text3.substring(4, 8));//s_am
            System.out.println(text2.endsWith("diena"));//true (bet skaito ir spaces
            System.out.println(text3.endsWith("Adios"));//false
            System.out.println(text2.length());//10
            System.out.println(Math.round(a + b));
            System.out.println(Math.min(a, b));
            System.out.println(Math.max(a, b));
            System.out.println(Math.random());
            System.out.println(Character.isAlphabetic(v));
            System.out.println(Character.isDigit(v));
            System.out.println(Character.isAlphabetic(z));
            System.out.println(Character.isDigit(z));
            System.out.println(Character.isLetter(z));
            System.out.println(Character.isLetter(v));
            System.out.println(Character.isAlphabetic(z));
            System.out.println(Character.isAlphabetic(v));
            System.out.println(Character.isDigit('5'));
            System.out.println(Character.isDigit('p'));
            System.out.println(Character.isLowerCase(z));

            int[] masyvas = {1,2,3,4,5,6,7,8,9};
            System.out.println(masyvas.length);
            String [] array = {"Vardas", "Pavarde", "Parasas"};
            String str = Arrays.toString(array);
            System.out.println(str);
            String mas = Arrays.toString(masyvas);
            System.out.println(mas);
            boolean l = Arrays.asList(mas).contains(1);//su skaiciais neveikia
            boolean r = Arrays.asList(array).contains("Pavarde");
            System.out.println(l);
            System.out.println(r);

        }
    }