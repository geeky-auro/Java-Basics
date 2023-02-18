import java.util.Scanner;

// Problem 1: Write a Java 
// program to perform basic Calculator operations using switch-case
// statement.


public class quetion1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st No.");
        int a=sc.nextInt();
        System.out.println("Enter 2nd No.");
        int b=sc.nextInt();
        System.out.println("Enter the operation to be performed");
        char c=sc.next().charAt(0);
        switch(c){
            case '+':
            {
                System.out.println("Sum of Two Numbers is "+(a+b));
                break;
            }
            case '-':
            {
                System.out.println("Difference of Two Numbers is "+(a-b));
                break;
            }
            case '*':
            {
                System.out.println("Product of Two Numbers is "+(a*b));
                break;
            }
            case '/':
            {
                if(b==0){
                    System.out.println("Infinity --> Cannot be computed");
                    break;
                }
                System.out.println("Quotient of Two Numbers is "+(a/b));
                break;
            }
            default:
            System.out.println("Entered Operation is not available ;)");
        }

    }
}