package paveldejimas.taskthreeonesix;

import java.util.ArrayList;
import java.util.List;

public class RemoteDisk implements Storage{

    private final List<Info> infos;
    public RemoteDisk() {
        infos = new ArrayList<>();
    }


    @Override
    public void saveInfo(Info info) {
        System.out.println("Saugoju i nutolusi diska");
        infos.add(info);

    }

    @Override
    public Info findInfo(int Id) {
        System.out.println("Rasta nutolusiame diske");
        for(Info info: infos){
            if(info.getId() == Id){
                return info;
            }
        }
        return null;
    }

    @Override
    public Info findInfo(String text) {
        System.out.println("Gautas elementas is saraso");
        for(Info info: infos){
            if(info.isContains(text)){
                return info;
            }
        }
        return null;
    }
}

/*
* Sukurti klasę NutolesDiskas, kuri įgyvendina Saugykla interfeisą
• Klasė turi turėti ArrayList, skirtą Info objektų saugojimui
• saugotiInfo metodas išsaugo gautą Info objektą į ArrayList
• Pirmasis rastiInfo metodas gauna Info iš sąrašo iteruodamas kiekvieną
elementą ir tikrindamas ar per parametrus gautas id yra lygus Info objekto id.
Grąžina pirmą rastą Info objektą
• Antrasis rastiInfo metodas gauna Info iš sąrašo iteruodamas kiekvieną
elementą ir tikrindamas ar per parametrus gautas žodis nėra Info objekto
tekste. Grąžina pirmą rastą Info objektą
• Visi metodai atspausdina kas buvo padaryta: „Issaugota i nutolusi diska“, „Rasta
nutolusiame diske pagal id“, „Rasta nutolusiame diske pagal zodi*/