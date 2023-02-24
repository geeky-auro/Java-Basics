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
        System.out.println("Outer Class");
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
        // Display of Outer Class Display() function ;)
        nestedclass.display();
        nestedClass.InnernestedClass innerObject=nestedclass.new InnernestedClass();
        // Display of Inner Class Display() function ;)
        innerObject.display();

        // Declaration of Static Class and accessing static class display method ;0
        nestedClass.staticNestedClass ob1=new nestedClass.staticNestedClass();
        ob1.display();
        System.out.println("Inner X in static class :"+staticNestedClass.inner_x);
        // Error
        // System.out.println("Static Inner Y (Int):"+staticNestedClass.inner_y);
        staticNestedClass sc=new staticNestedClass();
        // Since inner_y is a property of the class so it cannot be accessed directly through class name
        // Can only be accessed via a object
        System.out.println("Static Inner Y (Int) Accessed using Object"+sc.inner_y);
        // Accessing of Local Inner Class 
        nestedclass.getValue();
    }


    /*
     * 
     * Static Nested Class
     * Note: It can only access static variables of the outer class
     * It is not really an Innner class rather it is an outer class that happens to be written inside another class
     * 
     * 
     */
    static int static_variable1=10;
    private static int static_variable2=20;
    
     static class staticNestedClass{
        static int inner_x=40;
        int inner_y=50;
        void display(){
            System.out.println("Inner Static Class");
        System.out.println("Static Variable:"+static_variable1);
        System.out.println("Private Static Variable:"+static_variable2);
        // Imp: Static variable cannot be accessed in an inner class , but private variable can be accessed
        // So Compilation Error ;0
        System.out.println("Inner Int data inside Static Class:"+inner_y);
        // Error becoz non-static variables cannot be accessed inside static class ;0
        // System.out.println("Outer Class Y:"+outer_y);
        }
     }


     /*
      * Local Inner Classes
        Most commonly defined inside a method
        Also called as inner-method class
        Note: Local Class cannot access variables inside the method they can only be used when declared as final
        There are many other Restrictions:-
        Local Inner Ckasses cannot have any access modifiers associated with them
        Applicable Modifiers are:-



      */
     private void getValue(){
        // Note: Local Variable can be accessed inside LocalInnerClass but it cannot be modified
        //  Upon Modifying it will yield error ;)
        // Note LocalInnerClass Variable should be instantiated inside the same method in which it was deifned ;)
        int num=20;
        
        class LocalInnerClass{
            // compilation Error
            // Num=40;
            public int divisor;
            public int reminder;

            public LocalInnerClass(){
                divisor=4;
                reminder=num%divisor;
            }

            private int getDivisor(){
                return divisor;
            }

            private int getReminder(){
                return reminder;
            }           
        }
        LocalInnerClass l=new LocalInnerClass();
        System.out.println("Local Inner Class Divisor :"+l.getDivisor());
        System.out.println("Local Inner Class Reminder :"+l.getReminder());    

     }

}
