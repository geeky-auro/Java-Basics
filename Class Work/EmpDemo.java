public class EmpDemo {
    
    public static void main(String[] args) {
        Object o1=new Employer();
        Employer e1=new Employer();
        e1.display();
        System.out.println(e1.toString());
        System.out.println(e1.hashCode());
        Class c=o1.getClass();
        System.out.println("Class of Object is "+c.getName());
        int x='z';
        int x1='Z';
        System.out.println(x+" "+x1+" "+(x-x1));
        System.out.println("pqr".compareTo("pqr"));
    }
    
}


class Employer{
    String empname="XYZ";
    static class Employee{
        static void disp(){
        Employer e1=new Employer();
        String temp=e1.empname;
        System.out.println("Employer Name:"+temp);       
        }
        void disp2(){
            System.out.println("A Non Static Method ;)");
        }
    }
    public void display(){
        Employee.disp();
        Employee e=new Employee();
        e.disp2();
    }
    @Override
    public String toString() {
        String xyz="Keras.io";
        return xyz;
    }
}
