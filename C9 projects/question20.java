public class question20
{
	public static void main(String args[])
	{
		java.util.Scanner input=new java.util.Scanner(System.in);
		int a[]=new int[10];
		int min=a[0],max=a[0];
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter a number:-");
			a[i]=input.nextInt();
		}
		for(int i=1;i<10;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum="+max+"\nMinimum="+min);

	}
}