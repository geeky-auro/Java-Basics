
public class question13
{
	public static void main(String args[])
	{
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.println("Enter a number:-");
		int x=input.nextInt();
		double s=0.0;
		for(int i=2;i<=20;i+=3)
		{
		 s=s+x/i;
		}
		System.out.println("Sum:"+s);
	}
}