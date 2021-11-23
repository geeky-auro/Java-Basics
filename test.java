public class test 
{
	public static void main(String args[])
	{
	System.out.println("The following result:-");
	int m=10;
	repeat(m);

	}
	public static void repeat(int i)
	{
	System.out.println("Auro Saswat Raj");
	if(i==0)
	{
	return;
	}
	repeat(i-1);

	}
}