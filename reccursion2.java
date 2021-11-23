import java.util.Scanner;
public class reccursion2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();

	Recarray ob=new Recarray(n);
	int i;
	for(i=0;i<n;i++)
	{
	ob.values[i]=i;
	}
	ob.printarray(n);
	}
}
 class Recarray
{
	static int c=0;
	int values[];
	 Recarray(int i)
	{
	values=new int[i];
	}
	//Dispaly arrays:-
	void printarray(int i)
	{
		
	if(i==0)
	{
	return;
	}
	else
	{
	printarray(i-1);
	c++;
	System.out.println("["+(i-1)+"] "+values[i-1]+" "+c);
	}
	}
}
