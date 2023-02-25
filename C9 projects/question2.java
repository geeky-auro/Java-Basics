import java.util.*;
public class question2
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter number days:-");
	int dt=input.nextInt();
	input.close();
	double totamt=0.0;
	System.out.println("Enetr the amount:-");
	double amt=input.nextDouble();
	double months=dt/30.436875;
	if (dt<=180) {
		totamt=amt*months*(5.5/100.0);
		System.out.println("Amount:"+totamt);
	}
	else if(dt>180 && dt<=364)
	{
		totamt=amt*months*(7.5/100.0);
		System.out.println("Amount:"+totamt);
	}
	else if(dt==365)
	{
		totamt=amt*months*(9.0/100.0);
		System.out.println("Amount:"+totamt);
	}
	else
	{
		totamt=amt*months*(8.5/100.0);
		System.out.println("Amount:"+totamt);
	}
}
}