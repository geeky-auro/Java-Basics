class showrec
{
	public static void main(String args[])
	{
	showrec ob=new showrec();
	int n=10;
	ob.fibo(0,1,n);
	}
	void fibo(int a,int b,int n)
	{
		int s=0;
	if(n==0)
	{
	return;
	}
	else
	{
	s=a+b;
	System.out.println(a);
	a=b;
	b=s;
	fibo(a,b,n-1);
	}
	}
}