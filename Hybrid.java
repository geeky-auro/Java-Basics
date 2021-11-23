import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class student
{
    int rollno;
    void getno(int n)
    {
        rollno=n;
    }
    void putno()
    {
        System.out.println("Roll number:"+rollno);
    }
}
 class test extends student
{
    float part1,part2;
    void getmarks(float f1,float f2)
    {
        part1=f1;
        part2=f2;
    }
    void putmarks()
    {
        System.out.println("Marks Obtained:-");
        System.out.println("part 1:"+ part1);
        System.out.println("part 2:"+ part2);
    }
}
interface sports
{
    float sportswt=6.0f;
    void putwt();
}
 class Results extends test implements sports
{
    float total;
    public void putwt()
    {
        System.out.println("Sports Wt:"+ sportswt);
    }
    public void display()
    {
        total=part1+part2+sportswt;
        putno();
        putmarks();
        putwt();
        System.out.println("Total="+ total);
    }
}


public class Hybrid
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Roll number:-");
        int roll=Integer.parseInt(bf.readLine());
        System.out.println("Enter Mark-1");
        float mrk1=Float.parseFloat(bf.readLine());
        System.out.println("Enter Mark-2");
        float mrk2=Float.parseFloat(bf.readLine());
        Results student1=new Results();
        student1.getno(roll);
        student1.getmarks(mrk1,mrk2);
        student1.display();
    }
}
