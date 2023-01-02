package paveldejimas.taskthreeonesix;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class DataBase implements Storage{





    @Override
    public void saveInfo() {
        HashMap<Integer, String> information = new HashMap<>();
        information.put(1,"Vienas");
        information.put(2, "Du");
        information.put(3, "Trys");
        information.put(4, "Keturi");
        information.put(5, "Penki");
    }

    @Override
    public int findInfo(int Id) {
     for (Map.Entry<Integer, String> entry : information.entryset() ){
         System.out.println((entry.getKey() + " = " + entry.getValue()));
     }

        /*for( Map.Entry<Integer, String> entry : vehicles.entrySet() ){
    System.out.println( entry.getKey() + " = " + entry.getValue() );
}*/
    }

    @Override
    public String findStringInfo(String textInfo) {
        return null;
    }

}

/* saugotiInfo metodas išsaugo gautą Info objektą į HashMap
• Pirmasis rastiInfo metodas gauna Info iš map‘o pagal key (id) ir grąžina jį
• Antrasis rastiInfo metodas gauna Info iš map‘o iteruodamas kiekvieną
reikšmę ir tikrindamas ar per parametrus gautas žodis yra Info objekto
tekste. Grąžina pirmą rastą Info objektą
• Visi metodai atspausdina kas buvo padaryta: „Issaugota i duomenu baze“,
„Rasta duomenu bazeje pagal id“, „Rasta duomenu bazeje pagal zodi*/
