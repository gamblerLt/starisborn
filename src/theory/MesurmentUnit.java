package theory;

public enum MesurmentUnit {
    MILLIMETER(1000, "mm"),
    CENTIMETER(100, "cm"),
    METER(1, "m"),
    KILOMETER(0.001, "km");

    private  final double unitValue = 0;
    private final String unitName;

    MesurmentUnit(double unitValue, String unitName){
        this.unitValue;
        this.unitName;
    }
    public double getUnitValue() {return  unitValue;}
    public String getUnitName() {return  unitName;}
}
}