
interface a
{
	public void showname1();
}
interface b
{
	public void showname2();
}
interface another extends a
{
	public void method1();
	public void method();
}
 class multiple 
{
	public void showname1()
	{
	System.out.println("THis is method-1");
	}
	public void showname2()
	{
	System.out.println("This is method-2");
	}
}
class multiple1 implements another
{
public void method()
{
	System.out.println("Another MEthod-1");
}
public void method1()
{
	System.out.println("Another Method-2");
}
}
public class testmultipllle 
{
	public static void main(String args[])
	{
	multiple ob=new multiple();
	ob.showname1();
	ob.showname2();
	multiple1 ob1=new multiple1();
	ob1.method1();
	ob1.method();
	ob1.showname1();
	}
}