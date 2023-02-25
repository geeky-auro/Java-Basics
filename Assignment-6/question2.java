// package Assignment-6;
import java.util.Scanner;
public class question2 {
    void area(int side){
        System.out.println("Area of Square "+(side * side * side));
    }
    void area(int breadth,int height){
        System.out.println("Area of Triangle "+((1/2.0)*breadth*height));
    }
    void area(String radius){
        int radius1=Integer.parseInt(radius);
        System.out.println("Area of Circle "+Math.PI*(radius1*radius1));
    }
    public static void main(String[] args) {
        question2 q2=new question2();
        q2.area("5");
        q2.area(6,7);
        q2.area(5);
    }
}
