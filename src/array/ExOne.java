package array;

import java.util.Scanner;

public class ExOne {
//    public static void main(String[] args) {
//        for (int j = 1; j <= 5; j++) {
//            System.out.println("jj" + j);
//        }
//
//    }
    //
    public static void main(String[] args){
        System.out.println("iveskite vardus");
        var names = getNames();

        for (var j = 0; j < names.length; j++){
            var currentName = names[j];
            var modifiedName = currentName.toUpperCase() + "-" + currentName.length() + "-" + j;
            System.out.println(modifiedName);
        }
    }
    static String[] getNames(){
        var scanner = new Scanner(System.in);
        var names = new String[10];

        for (var i = 0; i <= 9; i++){
          var name = scanner.nextLine();
            names [i] = name;
        }
        return names;
    }
}

