public class question15
{
	public static void main(String args[])
	{
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.println("Enter a number:-");
		int n=input.nextInt();
		int i,k=0,s=0;
		
		for(k=1,i=3;k<=n;i+=2,k++)
		{
			System.out.print(","+s);
			s=s+i;
			
		}
	}
}
