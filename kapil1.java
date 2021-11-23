import java.io.*;
class kapil1
{
	public static void main(String[] args) 
    {
    try
    {
    File file=new File("Demo1.txt");
    File file1=new File("Demo2.txt"); 

    file.createNewFile(); 
    file1.createNewFile();

    FileOutputStream fo=new FileOutputStream(file);
    FileOutputStream foi=new FileOutputStream(file1);
    for(int x=0;x<5;x++)
    {
    fo.write(x);
    }
    fo.close();
    FileInputStream fi=new FileInputStream(file);
    System.out.println("Contents in File 1");
    for(int i=0;i<5;i++)
    {
    int x=fi.read();
    System.out.println(x);
    foi.write(x);
    } 
    fi.close();
    foi.close();
    FileInputStream fio=new FileInputStream(file1);
    System.out.println("Contents in File 2");
     for(int i=0;i<5;i++)
    {
    int x=fio.read();
   	System.out.println(x);
    } 
    fio.close();
    } 
    catch(Exception e)
    {
    System.out.println(e);
    }
  }
} 