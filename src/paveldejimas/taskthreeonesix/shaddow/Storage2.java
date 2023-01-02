package paveldejimas.taskthreeonesix.shaddow;

public interface Storage2 {
    void saveInfo();
    double findInfo();
    String findfInfo();
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
nutolusiame diske pagal id“, „Rasta nutolusiame diske pagal zodi“*/