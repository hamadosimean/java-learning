package  variable;
public class CarWithConstructors {
    String make;
    String model;
    String color;
    String type;

    public CarWithConstructors(){
        this.model = "Tesla";
        this.make = "2026";
        this.color ="black";
        this.type ="electric";

    }


    public CarWithConstructors( String make, String model, String color, String type){
        this.model = model;
        this.make = make;
        this.color =color;
        this.type =type;

    }

    @Override
    public String toString() {
        return "CarWithConstructors{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
