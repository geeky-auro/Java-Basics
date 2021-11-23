import java.util.*;
public class question5
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your choice");
	System.out.println("f for:Fahrenheit to Celsius");
	System.out.println("c for:Celsius to Fahrenheit");
	char ch=input.next().charAt(0);
	switch(ch)
	{
		case 'f':
		{
			System.out.println("Enter temperature in Celsius");
			int ce=input.nextInt();
			double fa=1.8*ce+32;
			System.out.println("Temperature:"+fa);
			break;
		}
		case 'c':
		{
			System.out.println("Enter temperature in Fahrenheit");
			int fa=input.nextInt();
			double ce = 5/9*(fa-32);
			System.out.println("Temperature:"+ce);
			break;
		}
		default:
		System.out.println("Wroung choice:-");
	}
}
}