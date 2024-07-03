package access.ex;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("item1", 100, 2);
        Item item2 = new Item("item2", 200, 3);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.display();
    }//main
}//class
