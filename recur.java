public class recur
{
    public static int i=10;
	public static void main(String args[])
	{
     int m=10;
     System.out.println("if reccursion success:-");
     callrec(m);


	}
	public static void callrec(int k)
	{
		System.out.println(i--);
	if(k>=0)
	{
	System.out.println(i);
	return;
	}
	System.out.println(i--);
	callrec(k--);

	
	}
}