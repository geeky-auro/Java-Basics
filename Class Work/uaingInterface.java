interface examples{
    int k=10;
    // Variables in Java Interfaces are implicitly final ;)
    void show();
    void add(int a,int b);
}

/*
 * Does Java support Multiple Inheritance?
 * Ans- No
 * Reason 1: Java Interfaces are not classes
 * Reason 2: Implementation of an Interface is not Inheritance in java
 * 
 */

public class uaingInterface implements examples {

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("Show Method is called");
        // throw new UnsupportedOperationException("Unimplemented method 'show'");
    }

    @Override
    public void add(int a, int b) {
        // TODO Auto-generated method stub
        System.out.println("Sum of two Numbers is "+(a+b));
        // throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    public static void main(String[] args) {
        uaingInterface u=new uaingInterface();
        uaingInterface.Boy b=u.new Boy();
        u.add(5, 10);
        b.showParts();
        b.showProperties();
        System.out.println("Using Child Class ;)");
        uaingInterface.child child=u.new child();
        child.showParts();
        child.showProperties();
    }

    interface properties{
        int car=10;
        void showProperties();
    }

    interface parts{
        void showParts();
    }

    class Boy implements properties,parts {
        @Override
        public void showProperties(){
            System.out.println("Eating ");
            System.out.println("Sleeping ");
            System.out.println("Hanging ");
        }
        @Override
        public void showParts(){
            System.out.println("Body Parts");
            System.out.println("Hands");
            System.out.println("Leg");
            System.out.println("Head");
            System.out.println("Tail");
        }
    }

    class child extends Boy{
        @Override
        public void showParts() {
            // TODO Auto-generated method stub
            System.out.println("From Parent");
            super.showParts();
            System.out.println("From Child");
        }

        @Override
        public void showProperties() {
            // TODO Auto-generated method stub
            System.out.println("From Parent Class");
            super.showProperties();
            System.out.println("From Child Class");
        }
    }
    
}
