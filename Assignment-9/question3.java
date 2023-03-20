// package Assignment-9;

public class question3 {
    public static void main(String[] args) {
        RedmiPhone r=new RedmiPhone();
        r.displayCamera();
        r.displayTouchScreen();
        r.fingerPrint();

        SamsungPhone s=new SamsungPhone();
        s.displayCamera();
        s.displayTouchScreen();
        s.fingerPrint();

        NokiaPhone n=new NokiaPhone();
        n.displayCamera();;
        n.displayTouchScreen();
        n.turboCharge();
    }
}

abstract class MobilePhone{
    void voiceCall(){

    }
    abstract void displayCamera();
    abstract void displayTouchScreen();

}  

interface AdditionalProperties{
    void fingerPrint();
}

class RedmiPhone extends MobilePhone implements AdditionalProperties{
    @Override
    void displayCamera() {
        // TODO Auto-generated method stub
        System.out.println("Redmi phone Camera");
    }

    @Override
    void displayTouchScreen() {
        // TODO Auto-generated method stub
        System.out.println("Redmi Phone Touch Screen");
    }

    @Override
    public void fingerPrint() {
        // TODO Auto-generated method stub
        System.out.println("Redmi phone Fingerprint");    
    }
}

class SamsungPhone extends MobilePhone implements AdditionalProperties{
    @Override
    void displayCamera() {
        // TODO Auto-generated method stub
        System.out.println("Samsung Camera");
    }

    @Override
    void displayTouchScreen() {
        // TODO Auto-generated method stub
        System.out.println("Samsung Touch Screen");
    }

    @Override
    public void fingerPrint() {
        // TODO Auto-generated method stub
        System.out.println("Samsung Touch Screen");
    }
}

class NokiaPhone extends MobilePhone{
    @Override
    void displayCamera() {
        // TODO Auto-generated method stub
        System.out.println("Nokia Phone Camera");
    }

    @Override
    void displayTouchScreen() {
        // TODO Auto-generated method stub
        System.out.println("Nokia Phone Touch Screen");
    }

    void turboCharge(){
        System.out.println("Nokia Phone Turbo Charge");
    }
}