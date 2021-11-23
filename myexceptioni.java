class myexceptioni
{
	String name;
	myexceptioni(String name)
	{
	this.name=name;
	}

	public void checkexception()
	{
		try
		{
		if(name.equalsIgnoreCase("India"))
		{
		System.out.println("You are Safe!!!");
		}
		else
		{
		throw new NoMatchException("String mismatch!!");
		}
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		System.out.println("Enter a String:");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String st=sc.nextLine();
		myexceptioni m=new myexceptioni(st);
		m.checkexception();
	}

}