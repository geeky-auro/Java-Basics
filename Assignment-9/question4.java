// package Assignment-9;

public class question4 {
   public static void main(String[] args) {
    WashingMachine m=new WashingMachine();
    m.run();
    m.consume();
   } 
}

interface Motor{
    int capacity=20;
    void run();
    void consume();
}

class WashingMachine implements Motor{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Washing Machine is Running ");
    }

    @Override
    public void consume() {
        // TODO Auto-generated method stub
        System.out.println("Washing Machine can consume a Maximum Load of "+ capacity +" Kg");
    }
}
