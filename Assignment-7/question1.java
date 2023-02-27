/**
 * question1
 */
public class question1 {

    public static void main(String[] args) {
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
	  double c=Double.parseDouble(args[2]);
	  if(a>b && a>c){
	  System.out.println(a+" is greatest");
	  }else if(b>c){
	  System.out.println(b+" is greatest");
	  }
	  else{
	  System.out.println(c+" is greatest");
	  }
    }
}
