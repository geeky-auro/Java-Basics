import java.util.Scanner;

// package Assignment-6;

public class question3 {

public static void main(String[] args) {
    Rectangle rect=new Rectangle();
    rect.input();
    rect.display();
    }

}

class Pair{
    int perimeter;
    int area;
    
}


class Rectangle{
    int length;
    int breadth;
    Pair ob=new Pair();
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length");
        length=sc.nextInt();
        System.out.println("Enter Breadth");
        breadth=sc.nextInt();
    }
    
    void Calculate(){
        ob.perimeter=2*(length+breadth);
        ob.area=length*breadth;
    }

    
    void display(){
        Calculate();
        System.out.println("Perimeter of the Rectangle "+ ob.perimeter);
        System.out.println("Area of the Rectangle "+ ob.area);
    }
}
