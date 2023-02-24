// package Class Work;

/*
 * 
 * Nested Classes :-
 * i)Inner Class 
 *  a)Inner Classes :-
 *  Nonstatic Nested Class
 * Syntax:-
     class OuterClass{
        (private/protected) class InnerClass{
   
        }
 * }
 *  b)Method Local Classes
 *  c)Anonymous Inner Classes (Mostly used in Event Handling)
 * ii) Static Nested Classes (Not very useful in practise)
 * 
 * Note : EVery Class Compiles  to a separate .class file
 *  To identify whether a class is inner class or not use $ symbol 
 * 
 *  
 */

public class nestedClass {
    /**
     * InnernestedClass
     */ 
    int outer_x=10;
    private int outer_y=20;
    static int outer_z=30;
    public class InnernestedClass {
        int inner_x=30;
        void display(){
            System.out.println("Inner Class");
            System.out.println("Outer_x:"+outer_x);
            System.out.println("Outer_Y:"+outer_y);
            // Static variable cannot be accessed in an inner class
            // So Compilation Error ;0
            System.out.println("Outer_x:"+outer_z);
            System.out.println("Inner_x:"+inner_x);
        }
    }
    void display(){
        System.out.println("Outer_x:"+outer_x);
        System.out.println("Outer_Y:"+outer_y);
        // Imp: Static variable cannot be accessed in an inner class , but private variable can be accessed
        // So Compilation Error ;0
        System.out.println("Outer_x:"+outer_z);
        // Error
        // System.out.println("Inner_x:"+inner_x);
    }
    public static void main(String[] args) {
        // nestedClass.InnernestedClass ob=new nestedClass.InnernestedClass();
        nestedClass nestedclass=new nestedClass();
        nestedClass.InnernestedClass innerObject=nestedclass.new InnernestedClass();
        innerObject.display();
    }
}
