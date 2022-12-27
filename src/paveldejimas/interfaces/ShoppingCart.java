package paveldejimas.interfaces;
//public class ShoppingCart extends Person implements Cart, Smart, ir tt{
public class ShoppingCart implements Cart, SecondCart{

    @Override
    public void printCartInfo(){
        System.out.println(getCartAmount());
    }
    @Override
    public  double getCartAmount(){
        return 999.99;
    }

    @Override
    public void secondCartMethod() {

    }
}
