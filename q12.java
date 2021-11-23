class q12
{
	int no1,no2;
	public int compute()
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);

	int n1=sc.nextInt();
	int n2=sc.nextInt();
	no1=n1;
	no2=n2;
	if(no1==no2)
	{
	return 0;
	}
	if(no1%6==no2%6)
	{
	return Math.min(no1,no2);
	}

	return Math.max(no1,no2);
	}
	public static void main(String args[])
	{
		q12 ob=new q12();
	System.out.println(ob.compute());
	}
}