package ecommerce;

public class Product {

    String name;
    double price;
    

    public Product(){

    }
    public Product(String name,double price){
        this.name = name;
        this.price = price;

    }

   public void ShowProductDetail(){
      System.out.println("Name: "+ this.name + " price: " +price);
   }
    



    
}
