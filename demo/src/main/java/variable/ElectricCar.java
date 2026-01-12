package variable;
public class ElectricCar extends Car {


       public  ElectricCar(){
           super();
           this.model = "Mercedez ben";
           this.type="Fuel";
       }

      static Battery  battery = new Battery();

       public void showEletricCard(){
           System.out.println(model);
       }
    }





