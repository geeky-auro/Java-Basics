



import java.util.*;
public class constructor
{
	public int a;
	

	public constructor(int a)
	{
	this.a=a;
	
	}


	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter 1st number:-");
	int a=in.nextInt();
	System.out.println("Enter 2nd number:-");
	int b=in.nextInt();

	constructor ob=new constructor(a);
	constructor ob1=new constructor(b);

	if(ob.a>ob1.a)
	{
	System.out.println("1st Number is greater:"+ob.a);
	}
	else
	{
	System.out.println("2nd Number is greater:"+ob1.a);
	}



	}
}


	

