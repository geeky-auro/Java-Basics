package commonTools;

import commonTools.MusicTools.MusicPlayer;
import commonTools.cameraTools.cameraTools1;

public class Phone implements cameraTools1,MusicPlayer {
    @Override
    public void play() {
        System.out.println("Music is Playing");
        
    }

    @Override
    public void pause() {
        System.out.println("Music is Pausing");
        
    }

    @Override
    public void stop() {
        System.out.println("Music has stopped");
        
    }

    @Override
    public void recorderCamera() {
        System.out.println("Recording Camera");
        
    }

    @Override
    public void clickCamera() {
        System.out.println("Clicking Camera");
        
    }
}
