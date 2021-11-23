
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class input
{
public static void main(String args[]) throws IOException
{
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader bf=new BufferedReader(in);
System.out.println("Enter a Integer:-");
int a=Integer.parseInt(bf.readLine());
System.out.println("Enter a Floating-point value:-");
float f=Float.parseFloat(bf.readLine());
System.out.println("The valuable input is:"+a);
System.out.println("Thank You!!");
}
}