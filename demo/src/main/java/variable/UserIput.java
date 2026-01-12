package variable;
import java.util.Scanner;
public class UserIput {
    
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter your request");
        while(true){
                String userInput = keyboard.next();
                if (userInput.length()<=2){
                    System.out.println("Sorry enter a valid question");
                }
                else{
                    if(userInput.toLowerCase().contains("hello")){
                        System.out.println("Hi there how can i help you today!!!");
                    }else{
                        System.out.println(userInput);
                    }
                }

              if(userInput.equalsIgnoreCase("exit")){
                break;
              }
        }
    }
    

}
