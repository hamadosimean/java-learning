package ecommerce;

public class Clothing extends Product {

    String size;

    public Clothing(String name, double price,String size){
        super(name,price);
        this.size = size;
    }

    @Override
    public void ShowProductDetail(){
        super.ShowProductDetail();
        System.out.println("Product size "+size);
    }
    
}
