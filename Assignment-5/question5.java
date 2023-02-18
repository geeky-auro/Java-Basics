import java.util.Scanner;

public class question5 {

    void showOptions(){
        System.out.println("Enter choice");
        System.out.println("1.Withdraw Cash");
        System.out.println("2.Deposit Cash");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        new question5().showOptions();
        int choice=sc.nextInt();
        double balance=1000.0 ;
        while(true){
            switch(choice){
                case 1:{
                    System.out.println("Withdraw Cash");
                    double withdraw=sc.nextDouble();
                    if((balance-withdraw)<=0){
                        System.out.println("Insufficient Balance");
                    }
                    balance=balance-withdraw;
                    System.out.println("Amount Withdrawed Successfully");
                    break;
                }
                case 2:
                {
                    System.out.println("Deposit Cash"); 
                    double amount=sc.nextDouble();
                    balance=amount+balance;
                    break;
                }
                case 3:
                {
                    System.out.println("Check Balance");
                    System.out.println("Available Balance is "+ balance);
                    break;
                }
                case 4:
                {
                    System.out.println("Thank you");
                    return;
                }
                default:{
                    System.out.println("Wrong Choice ");
                }
            }
            new question5().showOptions();
            choice=sc.nextInt();
        }
        

    }
    
}