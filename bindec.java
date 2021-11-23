class bindec
{
	public static void main(String args[])
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	int n=sc.nextInt();
	int i=0,rem;
	double s=0.0;
	while(n!=0)
	{
	rem=n%2;
	s=s+rem*Math.pow(10.0,i);
	i++;
	n=n/2;
	}
	System.out.println("Decimal to binary:"+(int)s);
	}
}