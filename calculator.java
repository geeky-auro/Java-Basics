import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class calculator
{
	public static void main(String args[]) throws IOException
	{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your Calculations Below:-");
	String st=bf.readLine();
	int index1;
	for(int i=0;i<=st.length();i++)
	{
	char ch=st.charAt(i);
	System.out.println(ch);
	if(ch=='+')
	{
	 index1=st.indexOf("+");
	String execute=st.substring(index1);
	System.out.println(index1);

	
	}
	// System.out.println(execute);
	
	}

	}
}