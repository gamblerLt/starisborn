package paveldejimas.taskthreeonesix;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataBase implements Storage {
    private final Map<Integer, Info> infos;

    public DataBase() {
        infos = new HashMap<>();
    }

    @Override
    public void saveInfo(Info info) {
        infos.put(info.getId(), info);
        System.out.println("Saugoti duomenu bazeje");
    }

    @Override
    public Info findInfo(int Id) {
        System.out.println("Rasti pagal ID");
        return infos.get(Id);
    }

    @Override
    public Info findInfo(String text) {
        System.out.println("Rasta db pagal zodi");
        for (Info info : infos.values()) {
            if (info.isContains(text)) {
                return info;
            }
        }
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
