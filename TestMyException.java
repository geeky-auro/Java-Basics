import java.lang.Exception;
class myexception extends Exception
{
	myexception(String msg)
	{
	super(msg);
	}
}
class TestMyException
{
	public static void main(String args[])
	{
	int x=5,y=1000;
	try{
	float z=(float)x/(float)y;
	if(z<0.01)
	{
	throw new myexception("Number is small:-");
	}
	}
	catch(myexception e)
	{
	System.out.println("Caught your exception:-");
	e.printStackTrace();
	}
	finally
	{
	System.out.println("I am alway's Here:-");
	}
	}
}
