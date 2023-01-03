package paveldejimas.taskthreeonesix;

public class Program {
    public static void main(String[] args) {
        Program program = new Program();
        DataBase dataBase = new DataBase();
        RemoteDisk remoteDisk = new RemoteDisk();
        Info info = new Info(1, "Pirmas");
        Info secondInfo = new Info(2, "Geras");

        program.save(dataBase, 1);
        program.save(remoteDisk, 2);
        program.find(dataBase, "Alo");
        program.find(remoteDisk, "Info");

    }
    private void save(Storage storage, int id) {
        Info info = storage.findInfo(id);
        System.out.println("info");
    }
    private void find(Storage storage, String text) {
        Info info = storage.findInfo(text);
        System.out.println("info");
    }
}

/*Klasėje taip pat turi būti dar trys statiniai metodai
• Metodas saugoti • Nieko negrąžina, bet priima Saugykla ir Info parametrus
• Metodas iškviečia Saugyklos metodą saugotiInfo
• Metodas rastiPagalId
• Nieko negrąžina, bet priima Saugykla ir id parametrus
• Metodas iškviečia Saugyklos metodą rastiInfo
• Atspausdina rastą Info objektą
• Metodas rastiPagalZodi
• Nieko negrąžina, bet priima Saugykla ir zodis parametrus
• Metodas iškviečia Saugyklos metodą rastiInfo
• Atspausdina rastą Info objektą



Main metode sukurti dviejų tipų saugyklas – nutolusį diską ir
duomenų bazę
• Sukurti keletą Info tipo objektų
• Iškviesti saugoti, rastiPagalid ir rastiPagalZodi metodus

*/