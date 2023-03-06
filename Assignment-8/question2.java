// package Assignment-8;
/*
 * 
 * Problem 2: Illustrate the execution of constructors in multi-level inheritance using three Java classes – Rectangle (length,Breadth),Box (length, breadth, height), Hollow box (length,breadth,height,thickness)
 * 
 */
public class question2 {
    public static void main(String[] args) {
        HollowBox h=new HollowBox();        
    }
    
}

class Rectangle{
    Rectangle(){
        System.out.println("Parent Class Rectangle Execution");
    }
}

class Box extends Rectangle{
    Box(){
        System.out.println("Child Class of Rectangle Execution ");
    }
}

/**
 * Innerquestion2
 */
class HollowBox extends Box {
    HollowBox(){
        System.out.println("Child Class of Box Execution ");
    }
}
