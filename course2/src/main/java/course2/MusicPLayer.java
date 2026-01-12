package course2;

public class MusicPLayer implements Player {


    @Override
    public void play(String title ){
        System.out.println("Playing song "+title);
    }

    @Override
    public void pause(){
    System.out.println("Pause ...");
    }

    @Override
    public void resume(){
        System.out.println("Resume ...");
    }

    public void shuffle(){
         System.out.println("Music list shuffled ...");
    }

    public void addVolume(){
         System.out.println("Volume added ...");
    }
    
}
