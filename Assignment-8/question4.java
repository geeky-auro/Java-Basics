import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class question4 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Customer c[]=new Customer[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Name of the Customer");
            String name=br.readLine();
            System.out.println("Enter Account Number ");
            int accountNumber=sc.nextInt();
            System.out.println("Enter Aadhar No.");
            long aadharNo=sc.nextLong();
            System.out.println("Enter Balance");
            double balance=sc.nextDouble();
            c[i]=new Customer(name, aadharNo, accountNumber, balance);
        }        
        System.out.println("Bank Customers ;)");
        for(int i=0;i<5;i++){
            c[i].display();
        }
    }
}

class Account{
    int accountNumber;
    double balance;
    Account(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void display(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}

// class Person extends 

class Customer extends Account{
    String name;
    long aadharNo;
    Customer(String name,long aadharNo,int accountNumber,double balance){
        super(accountNumber,balance);
        this.name=name;
        this.aadharNo=aadharNo;
    }
    
    @Override
    void display(){
        System.out.println("Customer Details");
        System.out.println("Account Number:"+super.accountNumber);
        System.out.println("Name of the Customer:"+this.name);
        System.out.println("Aadhar No.:"+this.aadharNo);
        System.out.println("Balance: "+super.balance);
    }
}
