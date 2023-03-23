public class adapter_class {
    public static void main(String[] args) {
        Dog a=new Dog();
        a.show();
    }    
}

/**
 * Inneradapter_class
 */
 interface x {
public void x1(int a);   
}
abstract class a1 implements x

{
@Override
public void x1(int a) {
    // TODO Auto-generated method stub
    
}
}



/*
 * Nested Interface
 * Need: To group related methods ;) into a single interface ;)
 * 
 * 
 * Class Ubside a Class
 * Interface inside an Interface
 * interface inside a class
 * class inside an interface
 * 
 * 
 */


 /**
  * Inneradapter_class
  */
 interface Animal {
 interface Activity{
    void show();
 }
}

class Dog implements Animal.Activity{
    @Override
    public void show() {
        // TODO Auto-generated method stub
        
    }
}
