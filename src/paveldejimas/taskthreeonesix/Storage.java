package paveldejimas.taskthreeonesix;

public interface Storage {

   void saveInfo(Info info);

   Info findInfo(int Id);

   Info findInfo(String text);


}

/*
* 1. Sukurti interfeisą Saugykla
* 2. Metodai:
* 2.1.saugoti info, priima info tipo paramrtrą ir nieko negražina
* 2.2. rasti info, priima id (skaicius) ir grąžina info tipo parametrą
* 2.3. rastiinfo, priima zodis (eilutės tipas) ir grąžina info tipo objektą
* */