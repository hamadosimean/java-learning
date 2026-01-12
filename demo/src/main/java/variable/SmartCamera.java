package variable;

public class SmartCamera extends Camera {

    public SmartCamera(){
        super();
    }
    
    public void takePicture(){
        super.takePicture("Night");

        System.out.println("Add AI features");
    }
    
}
