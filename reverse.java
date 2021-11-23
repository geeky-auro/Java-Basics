import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class reverse
{
	public int reverseno;
	public reverse(int reverseno)
	{
	this.reverseno=reverseno;
	}
	public static int reverseno(int reversei)
	{
	int s=0,dig=0;
	while(reversei!=0)
	{
	dig=reversei%10;
	s=s*10+dig;
	reversei=reversei/10;
	}
	return s;
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number below:-");
		int n=Integer.parseInt(bf.readLine());
		reverse no=new reverse(n);
		System.out.println("Reversed number:"+ reverseno(no.reverseno));

	}
}