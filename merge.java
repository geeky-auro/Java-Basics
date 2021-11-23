import java.util.*;
public class merge
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[b.length+a.length];
		int i=0,k=0;
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter a Element: for A");
			a[i]=sc.nextInt();
			c[i]=a[i];
		}
		for(i=0;i<b.length;i++)
		{
			System.out.println("Enter a Element: for B");
			b[i]=sc.nextInt();
			c[a.length+i]=b[i];
		}	
		for(int arr: c)
		{
			System.out.println(arr);
		}
	}
}
// {45,65,78,98,7}-5
// {45,65,78,98,7}-5=10