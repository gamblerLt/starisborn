package kidding.failai.poema;

import java.io.Serializable;

public class Poema implements Serializable {
    private final String poemName;
    private final String poem;

    public Poema(String poemName, String poem) {
        this.poemName = poemName;
        this.poem = poem;
    }

    @Override
    public String toString() {
        return poemName + "\n\n" + poem;
    }
}
