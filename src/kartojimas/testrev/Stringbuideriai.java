package kartojimas.testrev;

public class Stringbuideriai {
    public static void main(String[] args) {
//https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/

        StringBuilder strBuild = new StringBuilder("TestAS");

        String zodis = "Radviliskis";
        strBuild.append(2018);
        strBuild.replace(1,5, "2018");
        strBuild.insert(5, "*");
        System.out.println(strBuild);

        System.out.println(zodis.substring(0,11));

        // get length of StringBuilder object
        int length = zodis.length();

        // print length
        System.out.println("Zodzio ilgis = "
                + length);

        System.out.println(zodis);


        int index = zodis.lastIndexOf("kis"); //skaiciuoja is kaires pradedant 0
        System.out.println("Paskutines raides indeksas : " + index);

        char ch = zodis.charAt(3);
        System.out.println(ch);

        System.out.println(zodis);

        //StringBuilder del = strBuild.delete(1,3);//antraszodis delete
        //System.out.println(del.toString());

        System.out.println(strBuild.reverse());
        System.out.println(strBuild.replace(0,1, "x"));//0,1 atima pirma raide ir parepleisina tuo kas kabutese
    }

    }
