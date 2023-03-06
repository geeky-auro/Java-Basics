import java.util.Scanner;

// package Assignment-8;

public class question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Dimensions of the Sheet ");
        System.out.println("Enter Length of the 2D Sheet");
        int l1=sc.nextInt();
        System.out.println("Enter Breadth of the 2D Sheet");
        int b1=sc.nextInt();
        System.out.println("Enter Dimensions of the Box ");
        System.out.println("Enter Lenght of the 3D Box");
        int l2=sc.nextInt();
        System.out.println("Enter Width of the 3D Box");
        int w2=sc.nextInt();
        System.out.println("Enter Height of the 3D Box");
        int h2=sc.nextInt();
        three_D three=new three_D(l1, b1, l2, w2, h2);
        three.calculatePrice();
    }
}

class two_D{
    protected int cost=40;
    protected int length,breadth;
    two_D(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
}

class three_D extends two_D {
    int cost=60;
    int length,width,height;

    three_D(int two_length,int two_breadth,int length,int width,int height){
        super(two_length,two_breadth);
        this.length=length;
        this.width=width;
        this.height=height;
    }

    void calculatePrice(){
        int three_D_volume=this.height*this.length*this.breadth;
        int two_D_area=super.length*super.breadth;
        int total_price=three_D_volume*cost+two_D_area*super.cost;
        System.out.println("Total Cost:"+total_price);
        System.out.println("Cost of Plastic Sheet:"+two_D_area*super.cost);
        System.out.println("Cost of Plastic Box:"+three_D_volume*cost);

    }
}

