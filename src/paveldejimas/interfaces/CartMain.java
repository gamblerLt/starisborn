package paveldejimas.interfaces;

public class CartMain {
    public static void main(String[] args) {
        Cart cart = new ShoppingCart();
        cart.printCartInfo();
        cart.printDefaultInfo();
    }
}
