// import ucpian.cse.sub;

public class inheritance_interface implements Add_Sub,Mul_Dib{
    @Override
    public void add(double x, double y) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void substract(double x, double y) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void multiply(double x, double y) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void divide(double x, double y) {
        // TODO Auto-generated method stub
        
    }
    public static void main(String[] args) {
        Add_Sub a;
        // a.add(0, 0);
        a=new inheritance_interface();
        a.add(0, 0);
    }
}

class inheritance_interface1 implements Add_Sub,Mul_Dib{
    @Override
    public void add(double x, double y) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void substract(double x, double y) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void multiply(double x, double y) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void divide(double x, double y) {
        // TODO Auto-generated method stub
        
    }
}

interface Add_Sub extends Mul_Dib{
    public void add(double x,double y);
    public void substract(double x,double y);
    default void x(){
        // Default Methods are backward Compatible ;))
    }
    @Override
    default void multiply(double x, double y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multiply'");
    }
    @Override
    default void divide(double x, double y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'divide'");
    }
}

interface Mul_Dib{
    public void multiply(double x,double y);
    public void divide(double x,double y);
}