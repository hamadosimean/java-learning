package ecommerce;

public class ShoppingCart {
    public void addItems(Product item){

        item.ShowProductDetail();
        System.out.println("Item added "+ item.name);
    }
}