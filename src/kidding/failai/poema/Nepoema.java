package kidding.failai.poema;

import java.io.Serializable;

public class Nepoema implements Serializable {
    private final int maestro;
    private final int personId;

    public Nepoema(int maestro, int personId) {
        this.maestro = maestro;
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Nepoema{" +
                "maestro=" + maestro +
                ", personId=" + personId +
                '}';
    }
}
