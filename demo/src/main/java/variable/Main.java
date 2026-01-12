package variable;

public class Main {
    public static void main(String[] args) {
        Camera camera = new Camera();
        SmartCamera mySmartCamera = new SmartCamera();

        camera.takePicture("Landscape");
        mySmartCamera.takePicture();

    }
}