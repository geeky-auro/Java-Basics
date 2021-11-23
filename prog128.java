import java.lang.Exception;
class NoMatchException extends Exception
{
	String name;
	NoMatchException(String name)
	{
		this.name=name;
	}
	public void display()
	{
		System.out.println("Name to be displayed:"+name);
	}
	public void check()
	{
		if (name.equalsIgnoreCase("India")) {
			System.out.println("You are safe:-");
		}
		else
		{
			try
			{
				throw new NoMatchException("NoMatchException : string is not equal to India.");
			}
			catch(NoMatchException e)
			{
			System.out.println("Your Exception:-");
			e.printStackTrace();
			}
			
		}
	}
}
class prog128
{
	public static void main(String args[])
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter a name:-");
		String st=sc.next();
		NoMatchException t=new NoMatchException(st);
		t.display();
		t.check();
		
	}
}