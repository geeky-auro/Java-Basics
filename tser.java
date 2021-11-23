interface PT1
{
	default void show()
	{
	System.out.println("Default PT1");
	}
}
interface PT2
{
	default void show()
	{
	System.out.println("Default PT2");
	}
}
class tser implements PT1,PT2
{
	public void show()
	{
	PT1.super.show();
	PT2.super.show();
	}
	public static void main(String args[])
	{
	tser ob=new tser();
	ob.show();
	}
}