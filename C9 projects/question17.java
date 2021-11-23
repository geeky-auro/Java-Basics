public class question17
{
	public static void main(String args[])
	{
	int a=0,b=1;
	System.out.println("Here it goes:-");
	int i,s=0;
	for(i=0;i<10;i++)
		{
			s=a+b;
			System.out.print(a+",");
			a=b;
			b=s;
			
		}
		System.out.print(".....");
	}
}