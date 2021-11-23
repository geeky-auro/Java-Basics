
interface c 
{
	default void methodc()
	{
	System.out.println("This is method C");
	}
}
interface d extends c
{
	public void methodc();
}
class testhybrid1 implements d
{
	public static void main(String args[])
	{
	testhybrid ob=new testhybrid();
	ob.methodc();
	}
}