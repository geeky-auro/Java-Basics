import java.util.Scanner;

public class question3 {
    int factorial(int n){
        if(n==0){
            return 1;
        }
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    } 

    double sinX(int n,int x){
        double radians=Math.toRadians(x);
        double sine=0,counter=0;
        for(int i=1;i<=n;i+=2,counter++){
            if(counter%2==0){
                sine=sine+(Math.pow(radians, i)/factorial(i));
            }else{
                sine=sine-(Math.pow(radians, i)/factorial(i));
            }
        }
        return sine;
    }


    double expX(int n,int x){
        
        double expo=1;
        for(int i=1;i<=n-1;i++){

                expo=expo+(Math.pow(x, i)/factorial(i));

        }
        return expo;
    }

    double cosX(int n,int x){
        double radians=Math.toRadians(x);
        double cose=0,counter=0;
        for (int i = 0; i <=n; i+=2,counter++) {
            if(counter%2==0){
                cose=cose+(Math.pow(radians,i)/factorial(i));
            }else{
                cose=cose-(Math.pow(radians,i)/factorial(i));
            }
        }
        return cose;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value");
        int x=sc.nextInt();
        System.out.println("Enter No. of terms ");
        int n=sc.nextInt();
        System.out.println("Sine of "+x+" is "+new question3().sinX(n, x));
        System.out.println("Cos of "+x+" is "+new question3().cosX(n, x));
        System.out.println("Exponential of "+x+" is "+ new question3().expX(n, x));
        System.out.println("Exponential of "+x+" is "+ Math.exp(x));
        boolean isCorrectExp=Math.round(Math.pow(new question3().sinX(n, x), 2)+Math.pow(new question3().cosX(n, x), 2))==1;
        if(isCorrectExp){
            System.out.println("The Value derived from Sine and Cos satisfies the Equn Sin^2+Cos^2=1");
        }else{
            System.out.println("The Value derived from Sine and Cos doesn't satisfies the Equn Sin^2+Cos^2=1");
        }
    }


    // Shortcut Method ;)
    public void shortCutMethod(int x){
        System.out.println("Sine of "+x+" is "+Math.sin(x));
        System.out.println("Cos of "+x+" is "+Math.cos(x));
        System.out.println("Exponent of "+x+" is "+Math.exp(x));
        // Verification of Sin^2+Cos^2=1
        boolean isCorrectExp=Math.round(Math.pow(Math.sin(x), 2)+Math.pow(Math.cos(x), 2))==1;
        if(isCorrectExp){
            System.out.println("The Value derived from Sine and Cos satisfies the Equn Sin^2+Cos^2=1");
        }else{
            System.out.println("The Value derived from Sine and Cos doesn't satisfies the Equn Sin^2+Cos^2=1");
        }
    }

}
