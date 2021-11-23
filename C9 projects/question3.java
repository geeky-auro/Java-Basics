import java.util.*;
public class question3
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Policy Holder Name Please:-");
	String name=input.nextLine();
	System.out.println("Enter sum:-");
	int sum=input.nextInt();
	System.out.println("Enter premium:-");
	int pr=input.nextInt();
	double dis=0.0,com=0.0;

	if (sum<=100000) {
		com=pr*2.0/100.0;
		dis=sum*5.0/100.0;
	}
	else if(sum>100000 && sum<=200000)
	{
		com=pr*3.0/100.0;
		dis=sum*8.0/100.0;
	}
	else if(sum>200000 && sum<=500000)
	{
		com=pr*5.0/100.0;
		dis=sum*10.0/100.0;
	}
	else
	{
		com=pr*7.5/100.0;
		dis=sum*15.0/100.0;
	}
	System.out.println("Name of the Place Holder:"+name);
	System.out.println("Sum Assured:"+sum);
	System.out.println("Premium:"+pr);
	System.out.println("Discount on the first premium:"+dis);
	System.out.println("Commission of the agent:"+com);

}
}
