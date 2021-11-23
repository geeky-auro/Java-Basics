public class question16
{
	public static void main(String args[])
	{
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.println("Enter a number:-");
		int n=input.nextInt();
		System.out.println("Enter a number:-");
		int a=input.nextInt();
		int i,k;
		double s=0.0;
		for(k=1,i=1;i<=n;i++,k+=2)
		{
			s=s+k/Math.pow(a,k);
		}
		System.out.println(s);
	}
}