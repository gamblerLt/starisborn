package theory;

public enum MesurmentUnit {
    MILLIMETER(1000, "mm"),
    CENTIMETER(100, "cm"),
    METER(1, "m"),
    KILOMETER(0.001, "km");

    private final double unitValue;
    private final String unitName;


    MesurmentUnit(double unitValue, String unitName){
             this.unitName = unitName;
             this.unitValue = unitValue;
    }
    public String getUnitName() {
        return  unitName;
    }
    public double getUnitValue() {
        return  unitValue;
    }

}
