package kartojimas.traukinys;

public class TrainExeption extends RuntimeException{

    public TrainExeption(String message) {
        super(message);
    }
}
//runtimeexeptiono klaida parodo pagal klases pavadinima
// kad problema su traukiniu,
// nereikia tingeti kurti klasiu