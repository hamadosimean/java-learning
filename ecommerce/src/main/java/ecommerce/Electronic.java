package ecommerce;

public class Electronic extends Product {

    int warrantyPeriode;

    public Electronic(String name, double price,int warrantyPeriode){
        super(name,price);
        this.warrantyPeriode = warrantyPeriode;
    }

    @Override
    public void ShowProductDetail(){
        super.ShowProductDetail();
        System.out.println("Warranty periode "+warrantyPeriode+" in months");
    }

    
}
