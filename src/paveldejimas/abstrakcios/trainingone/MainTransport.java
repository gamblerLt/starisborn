package paveldejimas.abstrakcios.trainingone;

import java.time.LocalDate;

public class MainTransport {
    public static void main(String[] args) {
        Transport t = new Car(LocalDate.of(2022, 10, 02), 5.1,"Raudona");
            t.printRegistrationDate();
            t.go();

            Transport t2 = new Truck(LocalDate.of(2021, 10, 11), 258, "Black");
                t2.printRegistrationDate();
                t2.go();
            }
        }