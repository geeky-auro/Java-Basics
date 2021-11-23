interface a
{
	public void methoda();
}
interface b extends a
{
	public void methodb();
}
interface c extends a
{
	public void methodc();
}
public class testhybrid 
{
	// public void methodc()
	// {
	// System.out.println("This is method C");
	// }
	// public void methodb()
	// {
	// System.out.println("This is method B");
	// }
	// public void methoda()
	// {
	// System.out.println("This is method A");
	// }
	public static void main(String args[])
	{
	testhybrid ob=new testhybrid();
	ob.methoda();
	ob.methodb();
	ob.methodc();
	}
}