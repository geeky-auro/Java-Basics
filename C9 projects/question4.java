import java.util.*;
public class question4
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your name:-");
	String name=input.nextLine();
	System.out.println("Enter your Basic salary:-");
	int sal=input.nextInt();
	double gsal=0.0,da=0.0,sa=0.0;
	if(sal<=10000)
	{
		da=10.0/100.0;
		sa=5/100.0;
		gsal=sal+da+sa;
	}
	else if(sal>10000 && sal<=20000)
	{
		da=12.0/100.0;
		sa=8.0/100.0;
		gsal=sal+da+sa;
	}
	else if(sal>20000 && sal<30000)
	{
		da=15.0/100.0;
		sa=10.0/100.0;
		gsal=sal+da+sa;
	}
	else
	{
		da=20.0/100.0;
		sa=12.0/100.0;
		gsal=sal+da+sa;
	}
	System.out.println("Name"+"\t"+"Basic"+"\t"+"DA"+"\t"+"Spl.Allwnce"+"\t"+"Gross Salary");
	System.out.println(name+"\t"+sal+"\t"+da+"\t"+sa+"\t"+gsal);
}
}