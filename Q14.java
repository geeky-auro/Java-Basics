import java.io.*;
public class Q14
{
	String name;
	int accno;
	String typeacc;
	double bal;

	public void assign_valu() throws Exception
	{
	InputStreamReader sc=new InputStreamReader(System.in);
	BufferedReader bf=new BufferedReader(sc);
	System.out.println("Enter your Name:-");
	String n=bf.readLine();
	name=n;
	System.out.println("Enter your accno:-");
	int no=Integer.parseInt(bf.readLine());
	accno=no;
	System.out.println("Enter your Account Type:-");
	String tyac=bf.readLine();
	typeacc=tyac;
	System.out.println("Enter your Account Balance:-");
	double balance=Double.parseDouble(bf.readLine());
	bal=balance; 
	}

	public void deposit(double money)
	{
	bal=bal+money;
	}
	public void withdraw(double money)
	{
	bal=bal-money;
	}
	public void display()
	{
	System.out.println("Name:"+name);
	System.out.println("Balance:"+bal);
	}

	public static void main(String args[]) throws Exception 
	{
	Q14 ob=new Q14();
	ob.assign_valu();
	ob.deposit(2500);
	ob.withdraw(50);
	ob.display();

	}
}