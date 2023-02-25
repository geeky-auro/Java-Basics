import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        System.out.println("Enter user choice");
        System.out.println("a.Circle");
        System.out.println("b.Square");
        System.out.println("c.Triangle");
        char c=new Scanner(System.in).next().charAt(0);
        switch(c){
            case 'a':
            {
                int r=new Scanner(System.in).nextInt();
                System.out.println("Area of the Circle is "+(Math.PI)*r*r);
                break;
            }
            case 'b':
            {
                int s=new Scanner(System.in).nextInt();
                System.out.println("Area of the Square is "+(s*s));
                break;
            }
            case 'c':{
                int b=new Scanner(System.in).nextInt();
                int h=new Scanner(System.in).nextInt();
                System.out.println("Area of the Triangle is "+(1/2.0)*b*h);
                break;
            }
            default:
            System.out.println("Wrong Choice Entered ");
        }
        
    }
}
