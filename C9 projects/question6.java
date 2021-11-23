import java.util.*;
public class question6
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your choice");
	System.out.println("1 for:Volume of a cuboid");
	System.out.println("2 for:Volume of a cylinder");
	System.out.println("3 for:Volume of a cone");
	int n=input.nextInt();
	System.out.println("Enter Height:-");
	double h=input.nextDouble();
	switch(n)
	{
		case 1:
		{
			System.out.println("Volume of a cuboid");
			System.out.println("Enter Length:-");
			int l=input.nextInt();
			System.out.println("Enter Breadth:-");
			int b=input.nextInt();
			double v;
			v = l*b*h;
			System.out.println("Volume of a cuboid:"+v);
			break;
		}
		case 2:
		{
			System.out.println("Volume of a cylinder");
			System.out.println("Enter Radius:-");
			int r=input.nextInt();
			double v;
			v=3.14*(r*r)*h;
			System.out.println("Volume of the cylinder:"+v);
			break;
		}
		case 3:
		{
			System.out.println("Volume of a cone");
			System.out.println("Enter Radius:-");
			int r=input.nextInt();
			double v= (1/3)*3.14*(r*r)*h;
			System.out.println("Volume of the cone:"+v);
			break;
		}

	}
}
}