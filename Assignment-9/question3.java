// package Assignment-9;

public class question3 {
    public static void main(String[] args) {
        RedmiPhone r=new RedmiPhone();
        r.displayCamera();
        r.displayTouchScreen();
        r.turboCharge();

        SamsungPhone s=new SamsungPhone();
        s.displayCamera();
        s.displayTouchScreen();
        s.fingerPrint();

        NokiaPhone n=new NokiaPhone();
        n.displayCamera();;
        n.displayTouchScreen();
        n.fingerPrint();
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

class RedmiPhone extends MobilePhone {
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

    void turboCharge(){
        System.out.println("Nokia Phone Turbo Charge");
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
        System.out.println("Samsung Finger Print");
    }
}

class NokiaPhone extends MobilePhone implements AdditionalProperties{
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

    @Override
    public void fingerPrint() {
        System.out.println("Nokia Finger Print");
    }
    
}