package exeptions.exercises;

public class ExeptionClass extends Exception{
    private String reason;

    public ExeptionClass(String reason) {
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

}
