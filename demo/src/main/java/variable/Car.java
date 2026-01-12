package  variable;
public class Car {
    String name ;
    String type  ;
    String model ;
    int year;

    public Car(){
        this.name = "Tesla";
        this.type = "electric" ;
        this.model = "Y-2026";
        this.year = 2025;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }



}
