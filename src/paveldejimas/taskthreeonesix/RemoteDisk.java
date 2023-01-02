package paveldejimas.taskthreeonesix;

public class RemoteDisk implements Storage{

    @Override
    public void saveInfo() {

    }

    @Override
    public int findInfo(int Id) {
        return 0;
    }

    @Override
    public String findStringInfo(String textInfo) {
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