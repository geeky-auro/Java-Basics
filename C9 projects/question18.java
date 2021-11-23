public class question18
{
	public static void main(String args[])
	{
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.println("Enter a number:-");
		int n=input.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			c++;
			}
		}
		if(c==2)
		{
			System.out.println("It is a prime number");
		}
		else
		{
			System.out.println("it is not a prime number");
		}
	}
}