public class question19
{
	public static void main(String args[])
	{
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.println("Enter a number:-");
		int n=input.nextInt();
		System.out.println("Enter a number:-");
		int m=input.nextInt();
		int c=0;
		int min=Math.min(n,m);
		for(int i=1;i<min;i++)
		{
		if(m%i==0 && n%i==0)
		{
			c++;
		}
		}
		if(c==1)
		{
			System.out.println("numbers are co-prime");
		}
		else
		{
			System.out.println("numbers are not co-prime");
		
		}
	}
}