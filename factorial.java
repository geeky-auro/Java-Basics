public class factorial
{
	public static void main(String args[])
	{
	System.out.println("The Results are below:-");
	System.out.println("Factorial of 6:"+fac(6));

	}
	public static int fac(int n)
	{
	int result;
	if(n==1 || n==0)
	return 1;

    //System.out.println(result);
	result=fac(n-1)*n;
	System.out.println(n+"X"+fac(n-1)+"="+result);
	return result;
	}
}