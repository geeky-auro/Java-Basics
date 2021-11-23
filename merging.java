import java.util.Scanner;
public class merging
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of 1st array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the length of 2nd array:");
		int m=sc.nextInt();
		int b[]=new int[m];
		int ptr=1,NA=1,NB=1;
		int s=m+n;
		int c[]=new int[s];
		while(NA<=a.length && NB<=b.length)
		{
		if(a[NA]<b[NB])
		{
		c[ptr]=a[NA];
		ptr++;
		NA=NA+1;
		}
		else
		{
		c[ptr]=b[NB];
		ptr++;
		NB=NB+1;
		}
	}
	}
}