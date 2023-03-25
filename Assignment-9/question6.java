// import org.jcp.xml.dsig.internal.SignerOutputStream;

public class question6 {
    public static void main(String[] args) {
    Phone s=new SmartPhone();
    s.details();
    s.cost();
    s.clickPicture();
    s.recordVideos();
    s.play();
    }
}

/**
 * Camera
 */
interface Camera {
    void clickPicture();
    void recordVideos();
}

interface Music_Player{
    void play();
    void pause();
    void stop();
}

abstract class Phone implements Camera,Music_Player{
    @Override
    public void clickPicture() {
        System.out.println("Picture Clicked Successfully and stored in Galary");
    }
    @Override
    public void recordVideos() {
        System.out.println("Videos Recorded Successfully and stored in Galary");
    }

    @Override
    public void play() {
        System.out.println("Playing Music ;)");
    }

    @Override
    public void pause() {
        System.out.println("Music has been Paused ");
    }
    @Override
    public void stop() {
        System.out.println("Music has been Stopped ");
    }

    void details(){
        System.out.println("SmartPhone comprised of all features ;)");
    }
    abstract void cost();
}

class SmartPhone extends Phone{

    @Override
    void details() {
        super.details();
        System.out.println("Name: Nokia 665");
        System.out.println("Brand: Nokia");
        System.out.println("Android Version: 13");
    }

    @Override
    void cost() {
        System.out.println("Max Retail Price: Rs 66650/-");
        
    }
    
}
