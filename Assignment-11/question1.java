//user-defined exception in java
import java.util.*;

//custom exception to check for negative numbers
class NegativeNumberException extends Exception {
    //Store Message ;)
    String msg;
    NegativeNumberException(String msg) {
        //passing the parameter to the super class constructor
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
	    try {
	        if(n<0){
	            throw new NegativeNumberException("no such user with username - "+n);
	        }else{
                System.out.println("No Exception and Number is "+n);
            }
	    }
	    catch(NegativeNumberException ex) {
	        //calls override toString() method
	        System.out.println(ex);
	    }
	}
}