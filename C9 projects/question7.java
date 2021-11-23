//1 Hr=60 mins,1 min=60 secs
//1 Hr=60*60 secs=3600secs
//1 sec=1/3600secs
//1 min=60 secs =>1 sec=1/60 mins

/*Number of Hours = ( (n % (24 * 3600)) / 3600 )
Number of Minutes = ( (n % (24 * 3600 * 3600)) / 60 )
Number of Seconds = ( (n % (24 * 3600 * 3600 * 60)) / 60 )*/

import java.util.*;
public class question7
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter in time seconds:-");
	int sec=input.nextInt();
	double hr=((sec %(24*3600))/3600);
	double min=((sec % (24 * 3600 * 3600)) / 60 );
	double seco=((sec % (24 * 3600 * 3600 * 60)) / 60 );
	System.out.println(hr+" Hour "+min+" Minutes "+seco+" Seconds ");

	}
}
