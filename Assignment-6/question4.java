import java.util.Scanner;

// package Assignment-6;

public class question4 {
    public static void main(String[] args) {
    System.out.println("Enter Number of Students ");    
    System.out.println("Enter No. of Students");
    int n=new Scanner(System.in).nextInt();
    Student s[];
    s=new Student[n];
    for(int i=0;i<s.length;i++){
        System.out.println("Enter Detail of Student "+(i+1));
        s[i].input();
    }
    for(int i=0;i<s.length;i++){
        s[i].display();
    }
    double lowCGPA=0;int index=0;
    for(int i=0;i<s.length;i++){
        if(s[i].CGPA<lowCGPA){
            lowCGPA=s[i].CGPA;
            index=i;
        }
    }
    System.out.println("Lowest CGPA is "+lowCGPA);
    s[index].display();
    }
}

class Student{
    int roll;   
    String name;
    double CGPA;
    void input(){
        roll=new Scanner(System.in).nextInt();
        name=new Scanner(System.in).next();
        CGPA=new Scanner(System.in).nextDouble();
    }
    void display(){
        System.out.println("Roll No. of Student:"+roll);
        System.out.println("Name of the Student:"+name);
        System.out.println("CGPA:"+CGPA);
    }
}