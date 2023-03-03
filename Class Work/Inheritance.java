public class Inheritance {
    /*
     * If you want to use the parent's zero-parameter constructor, you must explicitly invoke one of the super class other constructors with the keyword super
     * Student(String name){
     * super(params);
     * ..............
     * }
     */
        // C c=new C();
        public static void main(String[] args) {
            C c=new C(10,20,30);
            // System.out.println(c.a);
            A a=new A(10);
            a.show();
            A b=new B(20,30);
            b.show();
            B bi=new B(20,30);
            bi.show();
            /*
             * Final method cannot be overridden
             * Static Methods cannot be overridden
             * Private Methods cannot be overriden
             * overridden method can be called in child class using super keyword
             * Constructors cannot be overriden becoz subclass COnstructor and Super class Names are mismatching so the signature stands different :\
             */
        }

        /*
         * Note: Protected is only visible to its own class and all of its subclasses..!
         */
}


class A{
    int a;
    A(int a){
        this.a=a;
        System.out.println("Inside A's Constructor");
    }
    void show(){
        System.out.println("Parent's Show()");
    }
}

/**
 * InnerInheritance
 */
class B extends A {
    int b;
    void show(String text){
        System.out.println("Calling SUper Class Method");
        super.show();
        System.out.println("Child B's show() with a parametered  Passed Text:"+text);
    }
    B(int b,int a){
        super(a);
        this.b=b;
        System.out.println("Inside B's Constructor");
    }
    
}

class C extends B{
    int c;
    C(int a,int b,int c){
        super(b,a);
        this.c=c;
        System.out.println("Inside C's Constructor");
    }
}