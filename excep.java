class excep
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};
	try
	{
	int a=5;

	double b=a/0;
	
	}
	catch(ArithmeticException e)
	{
	//
		e.printStackTrace();
		try
		{
		System.out.println(arr[6]);	
		}
		catch(ArrayIndexOutOfBoundsException el)
	{
		el.printStackTrace();
	}
		
	}
	
	}
}