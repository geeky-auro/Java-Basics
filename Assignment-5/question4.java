import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=(a>b && a>c)?a:b>c?b:c;
        int min=(a<c && a<b)?a:b<c?b:c;
        System.out.println("Maximum of 3 No's is "+max);
        System.out.println("Minimum of 3 No's is "+min);
    }
}
