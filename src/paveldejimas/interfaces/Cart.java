package paveldejimas.interfaces;

public interface Cart {
    void printCartInfo();
    double getCartAmount();

    default void printDefaultInfo(){
        System.out.println("Tai defoltionis metodas");
    }
}
