package nulis.taskOne;

public class Main {
    public static void main(String[] args) {
     Address homeAddress = new Address(new Town("Kaunas"));

    }
    public  static  String getTownAddress(Address address){

        String townName = null;
        if(address != null){
            Town town = address.getTown();
            if (town != null){
                townName = town.getPavadinimas();
            }
        }
        return townName;
    }
}
