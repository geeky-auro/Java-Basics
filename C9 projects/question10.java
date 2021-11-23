import java.util.*;
public class question10
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Selling Price:-");
		int Sp=input.nextInt();
		double Pcp=(Sp/(1+(20.0/100.0)));
		double Lcp=(Sp/(1-(20.0/100.0)));
		System.out.println("Profit Cost price:"+Pcp);
		System.out.println("Loss Cost Price:"+Lcp);
		if(Sp>Pcp)
		{
			System.out.println("Total cost price of the calculators:"+Pcp);
		} 
		else if(Sp<Lcp)
		{
			System.out.println("Total cost price of the calculators:"+Lcp);
		}
	}
}