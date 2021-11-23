	import java.io.*;  
	import java.util.Scanner;  
	public class readip  
	{  
	public static void main(String args[])  
	{  
	try  
	{  
	//the file to be opened for reading  
	FileInputStream fis=new FileInputStream("Demo.txt");       
	Scanner sc=new Scanner(fis);    //file to be scanned  
	//returns true if there is another line to read  
	while(sc.hasNextLine())  
	{  
	System.out.println(sc.nextLine());      //returns the line that was skipped  
	}  
	sc.close();     //closes the scanner  
	}  
	catch(IOException e)  
	{  
	e.printStackTrace();  
	}  
	}  
	}  