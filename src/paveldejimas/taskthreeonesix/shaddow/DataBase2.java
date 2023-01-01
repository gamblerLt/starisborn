package paveldejimas.taskthreeonesix.shaddow;

import java.util.HashMap;

public class DataBase2 implements Storage2{

    HashMap<Double, String>dataForStorage = new HashMap<Double, String>();

    @Override
    public void saveInfo() {

    }

    @Override
    public double findInfo() {
        return 0;
    }

    @Override
    public String findfInfo() {
        return null;
    }
    //dataForStorage.put(1, "Pavadinimas");



}
