public class question6 {

    public static void main(String[] args) {
        System.out.println("Overloading Subtract Method");
        question6 q6=new question6();
        question6.Subtract s=q6.new Subtract(); 
        s.subtract("56", "60");
    }
    class Subtract{
        void subtract(int a,int b){
            System.out.println("Difference of "+a+" and "+b+" is "+(a-b));
        }
        void subtract(double a,double b){
            System.out.println("Difference of "+a+" and "+b+" is "+(a-b));
        }
        void subtract(String a,String b){
            System.out.println("Difference of "+a+" and "+b+" is "+(Double.parseDouble(a)-Double.parseDouble(b)));
        }
        void subtract(long a,long b){
            System.out.println("Difference of "+a+" and "+b+" is "+(new Double(a)-new Double(b)));
        }
    }
}


