//user-defined exception in java
import java.util.*;

//custom exception to check for negative numbers
class NegativeNumberException extends Exception {
    //Store Message ;)
    String msg;
    NegativeNumberException(String msg) {
        super(msg);
        this.msg=msg;
    }
    
    //overriding with our custom message
    @Override
    public String toString() {
        return msg;
    }
}

public class question1 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        try{
            new question1().processInput(n);
        }catch(NegativeNumberException ni){
            System.out.println("Exception Occoured"+ni.toString());

        }
	}

     void processInput(int n) throws NegativeNumberException {
        if (n < 0) {
            throw new NegativeNumberException("Negative Number");
        }else{
            System.out.println("Positive Number");
        }
    }
}