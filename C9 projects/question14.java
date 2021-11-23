public class question14
{
	public static void main(String args[])
	{
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.println("Enter a number:-");
		int x=input.nextInt();
		int s=0;
		for(int i=1;i<x;i++)
		{
			if(x%i==0)
			{
				s=s+i;
			}
		}
		if(s==x)
		{
			System.out.println("It is a perfect Number:-");
		}
		else
		{
			System.out.println("It is not a perfect number:-");
		}
	}
}