package  variable;
public class Battery{
    int size = 100;
    String durationOfCharge = "5h";

    @Override
    public String toString() {
        return "Bettery{" +
                "size=" + size +
                ", durationOfCharge='" + durationOfCharge + '\'' +
                '}';
    }
}
