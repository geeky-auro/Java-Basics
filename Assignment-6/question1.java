import java.util.Scanner;

class Box{
    int length,width,height;
    Box(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    void volume(){
        System.out.print("Volume of the Box is "+(length*width*height));
    }
    void surfaceArea(){
        System.out.println("Suraface Area of the box"+(2*((length*width)+(width*height)+(height*length))));
    }
}

public class question1 {
    public static void main(String[] args) {
        BoxDemo b1=new BoxDemo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length");
        int length=sc.nextInt();
        System.out.println("Enter Breadth");
        int breadth=sc.nextInt();
        System.out.println("Enter Height");
        int height=sc.nextInt();
        b1.showOutput(length, breadth, height);
    }
}

class BoxDemo{
    void showOutput(int l,int b,int h){
        Box b1=new Box(l,b,h);
        b1.volume();
        b1.surfaceArea();
    }
}
