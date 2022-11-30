package theory;
import java.sql.SQLOutput;
import java.util.Scanner;
public class MainMesurementUnit {
    public  static  void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Iveskite metrus");
        double value = scn.nextDouble();
    }
    System.out.printf("%sm converted to %s%s%n", value, value * MesurmentUnit.KILOMETER.getUnitValue(), MesurmentUnit.KILOMETER.getUnitName());
    System.out.printf("%sm converted to %s%s%n", value, value * MesurmentUnit.MILLIMITER.getUnitValue(), MesurmentUnit.MILLIMETERR.getUnitName());


}
