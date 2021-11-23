import java.util.*;
public class question11
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Eneter a number:");
		int n=input.nextInt();
		int i;
		System.out.print("0");
		for(i=2;i<=n;i++)
		{
			System.out.print(","+(int)Math.pow(2,i));
		}
	}
}
