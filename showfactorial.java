public class showfactorial
{
	public static void main(String args[])
	{
	System.out.println("The Results are below:-");
	fac(6);

	}
	public static void fac(int n)
	{
	int result;
	if(n==1 || n==0)
	{
		System.out.println(1);
		return;
	}

	//return 1;

    //System.out.println(result);
	//result=fac(n-1)*n;
	System.out.println(n+"X"+(n-1)+"="+((n-1)*n));
	//return result;
	}
}