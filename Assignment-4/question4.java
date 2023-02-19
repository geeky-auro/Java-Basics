// import java.util;
import java.util.Scanner;
public class question4{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a No. to be checked");
    int a=sc.nextInt();
    int b=a;
    int s=0;
while (a!=0) {
    int dig=a%10;
    s=s*10+dig;
    a=a/10;
}
if(s==b){
    System.out.println("It is a pallindrome Number ;");
}else{
    System.out.println("It is not a pallindrome Number");
}
}
}