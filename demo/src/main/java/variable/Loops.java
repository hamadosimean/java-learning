package  variable;
import java.util.Scanner;
public class Loops {

    public static void main(String[] args) {
//        for(int i =0; i<=20;i++){
//            System.out.println(i);
//        }
//
//        for(int i =10; i>=1;i--){
//            System.out.println(i);
//        }


        Scanner keyboard = new Scanner(System.in);


        boolean running = true;

        while(running){

            System.out.println("1. ---- Add a name------ ");
            System.out.println("2. -- remove a name----- ");
            System.out.println("3. ---- Search a name--- ");
            System.out.println("4. ---- Quit-- ");
            System.out.println("\n");
            System.out.println("Enter your choice: ");

           int userInput = keyboard.nextInt();

switch (userInput) {
    case 1:
        System.out.println("\n Adding...\n");
        break;
    case 2:
        System.out.println("\n Removing...\n");
        break;
    case 3:
        System.out.println("\n Searching...\n");
        break;
    case 4:
        running = false;
        break;
    default:
        System.out.println("\n Choice out of range\n");
}

            
        }
    }
}
