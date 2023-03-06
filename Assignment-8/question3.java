// package Assignment-8;

public class question3 {
    public static void main(String[] args) {
        iRectangle rect=new iRectangle(40, 40);
        Circle c=new Circle(4);
        rect.showArea();
        c.showArea();
    }    
}

class Shape{
    double area;
    void showArea(){}
}

class iRectangle extends Shape{
    int length,breadth;
    iRectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        super.area=this.length*this.breadth;
    }
     void showArea(){
        System.out.println("Area of the Rectangle:"+super.area);
    }
}

/**
* 
 */
class Circle extends Shape {
    int radius;
    Circle(int radius){
        this.radius=radius;
        super.area=Math.PI*this.radius*this.radius;
    }
    void showArea(){
        System.out.println("Area of the Circle:"+super.area);
    }
    
}