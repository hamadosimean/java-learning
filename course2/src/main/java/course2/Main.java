package course2;

public class Main {
    public static void main(String[] args) {
        Date studentDateOfBirth = new Date(31, 12, 2000);
       Student student = new Student("Simean", studentDateOfBirth, "CS", "Ouedraogo");

       student.getDetails();
       student.getName();

    MusicPLayer music = new MusicPLayer();

        music.play("Essai encore");

        music.addVolume();
    }
}