package kartojimas;

import java.util.Scanner;

public class MixLetters {

    //atimti ilgi viena is kito substringinti
    public static void main(String[] args) {

        MixLetters mixLetters = new MixLetters();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1");
        String a = scanner.nextLine();
        System.out.println("2");
        String b = scanner.nextLine();
        System.out.println(a.length() + "" + b.length());
        System.out.println(mixLetters.mixStrings(a, b));

       // System.out.println(a.charAt(0)+""+b.charAt(0));




    }
  private String mixStrings(String a, String b){
        int length = a.length() > b.length() ? a.length() : b.length();
      StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++){
            if(i < a.length()){
                sb.append(a.charAt(i));
            }
            if (i < b.length()){
                sb.append(b.charAt(i));
            }
        }
        return sb.toString();
//reikia sita padaryti su ifais, ira ikeltas pavyzdys

  }

}
