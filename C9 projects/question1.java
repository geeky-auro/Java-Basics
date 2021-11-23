import java.util.*;
public class question1
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your Name:-");
	String name=input.nextLine();
	System.out.println("Enter your Age:-");
	int age=input.nextInt();
	System.out.println("Please enter your Taxable Income:-");
	int income=input.nextInt();
	double IT=0.0;

		if(age>60)
		{
		System.out.println("Wrong category:-!!");
		}
		else
		{
			if(income<=250000)
			{
			System.out.println("Name:"+name+"Age:"+age);
			System.out.println("Income Tax:NIL");
			}
			else if(income>250000 && income<=500000)
			{
			IT=(income-250000)*10.0/100.0;
			System.out.println("Name:"+name+"Age:"+age);
			System.out.println("Rate of income tax:"+IT);
			}
			else if(income>500000 && income<=1000000)
			{
			IT=(income-500000)*20.0/100.0 + 25000;
			System.out.println("Name:"+name+"Age:"+age);
			System.out.println("Rate of income tax:"+IT);
			}
			else if(income>1000000)
			{
			IT=(income-1000000)*30.0/100.0+125000;
			System.out.println("Name:"+name+"Age:"+age);
			System.out.println("Rate of income tax:"+IT);
			}
		}
	}
}