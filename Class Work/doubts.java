public class doubts extends I1 {
    @Override
    void add(String name) {
        // TODO Auto-generated method stub
        
    }
    
    public static void main(String[] args) {
        doubts d=new doubts();
        // d.add("Hello");
        d.adds();
    }
}

abstract class I1{
    abstract void add(String name);
    void adds(){
        System.out.println("Simple Addition");
    }
}
