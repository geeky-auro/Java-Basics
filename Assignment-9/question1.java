// import outerfit.auro;

// package Assignment-9;

abstract class Student{
    String name;
    int roll;
    long reg_no;
    Student(String name,int roll, long reg_no){
        this.name=name;
        this.roll=roll;
        this.reg_no=reg_no;
    }
    abstract void course();
    abstract void academics();
}

class KiiTian extends Student{

    KiiTian(String name,int roll,long reg_no){
        super(name,roll,reg_no);
    }
    void course(){
        System.out.println("OS");
        System.out.println("DBMS");
        System.out.println("Probability & Statistics");
        System.out.println("WT");
        System.out.println("PDC by Anuj");
    }
    void academics(){
        System.out.println("Student Name:"+super.name);
        System.out.println("Roll:"+super.roll);
        System.out.println("Registration Number:"+super.reg_no);
        System.out.println("Sports");
        System.out.println("Socities ;)");
    }
}

public class question1 {
    public static void main(String[] args) {
        KiiTian auro=new KiiTian("AURO", 22057020, 1517602);
        auro.academics();
        auro.course();
    }
}
