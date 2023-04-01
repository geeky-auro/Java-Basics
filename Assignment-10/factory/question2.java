package factory;
import commonTools.Phone;


/**
 * question2
 */
public class question2 extends Phone{
    public static void main(String[] args) {
       Phone phone = new Phone();
        phone.clickCamera();
        phone.play();
        phone.pause();
        phone.stop();
        phone.recorderCamera();
        
    }
    
}