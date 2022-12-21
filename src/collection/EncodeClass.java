package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EncodeClass {
    //reikes meniu, uzkoduoti, atkoduoti

    private static final String CODES = "32 tarpas;65 A;82 R;105 i;33 !;66 B;83 S;106 j;44 ,;67 C;84 T;" +
            "107 k;46 .;68 D;85 U;108 l;48 0;69 E;86 V;109 m;49 1;70 F;87 W;110 n;50 2;71 G;88 X;111 o;" +
            "51 3;72 H;89 Y;112 p;52 4;73 I;90 Z;113 q;53 5;74 J;97 a;114 r;54 6;75 K;98 b;115 s;55 7;76 L;" +
            "99 c;116 t;56 8;77 M;100 d;117 u;57 9;78 N;101 e;118 v;63 ?;79 O;102 f;119 w;80 P;103 g;120 x;" +
            "81 Q;104 h;121 y;122 z";

 //4
 //puriame konstanta
    private static  final String SPACE = " ";


    //2
    //kuriame 2 klases kintamuosius:
    //1kintamasis tipo tokiam 12  a, ty Key yra raide value yra koduote
    private final Map<String, String> encodes = new HashMap<>();

    //1kintamasis tipo tokiam a   12, ty key yra koduote, o value raide
    private final Map<String, String> decodes = new HashMap<>();


    public static void main(String[] args) {
//5
        EncodeClass encodedecode = new EncodeClass();
        encodedecode.fillUpMaps();

        Scanner sc = new Scanner(System.in);

        String action;

        do {
            encodedecode.menu();
            action = sc.nextLine();
            encodedecode.selectAction(sc, action); // sitas eina case 3 //7
        }while(!action.equals("3"));

    }
    //6
        private void selectAction(Scanner sc, String action){
        switch (action){
            case "1" -> encode(sc);
            case "2" -> decode(sc);
            case "3" -> System.out.println("EXIT");
            default -> System.out.println("nera tokio");
        }
    }
    //8
    //8.2.
    private void encode(Scanner sc){
        //Labas sita koduosiu teksta
        System.out.println("Iveskite uzkoduota teksta");
        String text = sc.nextLine();

        //9>>
        StringBuilder sb = new StringBuilder();

        /*for(int i = 0; i > text.length(); i++){
            String letter = String.valueOf(text.charAt(i));*/
        for(char c: text.toCharArray()){
            String letter =  String.valueOf(c);
            //yra kitas variantas pas andriu

            String code = encodes.get(letter);
            if (code == null){
                System.out.println("Tokios raides koduotes nera" + letter);
                continue;
            }
            //9
            sb.append(code).append(SPACE);

        }
        System.out.println("uzkoduotas tekstas yra: "+ sb.toString().trim());


    }

    //8.1.
    private void decode(Scanner sc){
        System.out.println("Iveskite norima dekoduoti koduote");
        String line = sc.nextLine();
        String[] splits = line.split(SPACE);

        StringBuilder sb = new StringBuilder();

        for(String s: splits){
            String letter = decodes.get(s);
            if(letter == null){
                System.out.println("Neegzistuoja koduote" + s);
                continue;
            }
            sb.append(letter);
        }
        System.out.println("Vertimas: " + sb);

    }


//1
    private void menu(){
        System.out.println("""
                <<<Meniu>>>
                1. Encode
                2. Decode
                3. Exit
                """);
    }
  //3
  //reikiametodo:
  private void fillUpMaps(){
        String[] pairs = CODES.split(";");
        for(String pair: pairs){
            String[] splitPairs = pair.split(SPACE);

            if(splitPairs.length != 2){
                continue;
            }
            String code = splitPairs[0];
            String letter =splitPairs[1].equals("tarpas") ? SPACE : splitPairs[1];

            encodes.put(letter, code);
            decodes.put(code, letter);
        }
  }

}
