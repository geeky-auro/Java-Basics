//1,2,3,4,5,6,7,8,9,10

public class patterneasy
{
	public static void main(String args[])
	{
	int m=2;
	int pow=5;
	power(m,pow);
	}
	public static void power(int no,int pow)
	{
		int k=no*no;
	if(pow==0)
	{
	System.out.print("1");
	return;
	}
	System.out.print(k+" ");
	power(k,pow-1);

	}
}