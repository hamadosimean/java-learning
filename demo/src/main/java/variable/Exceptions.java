package variable;

public class Exceptions {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
