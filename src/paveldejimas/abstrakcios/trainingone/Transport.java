package paveldejimas.abstrakcios.trainingone;

import java.time.LocalDate;

public abstract class Transport {
    private final LocalDate registrationDate;
    private final String color;

    public Transport(LocalDate registrationDate, String color) {
        this.registrationDate = registrationDate;
        this.color = color;
    }
}
