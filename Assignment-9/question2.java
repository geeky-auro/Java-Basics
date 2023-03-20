// package Assignment-9;

public class question2 {
    public static void main(String[] args) {
        Area a=new Area();
        a.circleArea(5);
        a.rectArea(4, 5);
        a.squareArea(6);
    }
}

abstract class Shape{
    abstract void rectArea(int l, int b);
    abstract void squareArea(int s);
    abstract void circleArea(int r); 
}

class Area extends Shape{
    void rectArea(int l, int b){
        System.out.println("Area of the Rectangle "+(l*b));
    }

    void squareArea(int s){
        System.out.println("Area of the Square "+(s*s));
    }

    void circleArea(int r){
        System.out.println("Area of the Circle "+(Math.PI*r*r));
    }
}
