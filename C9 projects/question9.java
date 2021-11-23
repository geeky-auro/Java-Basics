import java.util.*;
public class question9
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Principle amount:-");
		int p=input.nextInt();
		double rate=10.0/100.0;
		int time=3*12;
		double Si=(p*rate*time)/100;
		double a=p*Math.pow((1+(rate/100.0)),time);
		double Ci=a-p;
		System.out.println("Difference Between Ci and Si:"+(Ci-Si));
	}
}
