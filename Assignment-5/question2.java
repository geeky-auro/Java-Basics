import java.util.Scanner;

// Problem 2: Write a Java program to draw a solid Diamond Pattern containing 
// (2n - 1) rows of a
// given special character, where n and the special 
// character are your user inputs.

public class question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=(2*n)-1;i++){
            for(int j=1;j<=Math.abs(n-i);j++){
                System.out.print(" ");
            }
            if(i<=n){
                for(int k=1;k<=i;k++){
                    System.out.print("* ");
                }
            }else{
                for(int l=1;l<=(2*n)-i;l++){
                    System.out.print("* ");
                }
            }             
            for(int j=1;j<=Math.abs(n-i-1);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
