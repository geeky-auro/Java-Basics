import java.util.*;
public class question8
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 1st Number:-");
		int a=input.nextInt();
		System.out.println("Enter 2nd Number:-");
		int b=input.nextInt();
		System.out.println("Value of a="+a+"\n"+"Value of b="+b);

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("Value of a="+a+"\n"+"Value of b="+b);
	}
}
