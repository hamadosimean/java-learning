package ecommerce;

public class Main {
    public static void main(String[] args) {
        Product el = new Electronic("MAC BOOK Pro AIR", 5000, 2);
        Product cl = new Clothing("Pull over", 60, "M");

        // el.ShowProductDetail();
        // cl.ShowProductDetail();
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItems(el);
        shoppingCart.addItems(cl);

    }
}