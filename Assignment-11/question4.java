class LessMinimumBalanceException extends Exception {
    String message;
    LessMinimumBalanceException(String message) {
        super(message);
        this.message =message;
    }
    @Override
    public String toString() {
        return this.message;
    }
}

class InvalidWithdrawlException extends Exception {
    String message;
    InvalidWithdrawlException(String message) {
        super(message);
        this.message=message;
    }    
    @Override
    public String toString() {
        return this.message;
    }
}

class BankAccount{
    int minimumBalance;
    BankAccount(){
        minimumBalance=5000;
    }   
    void withDraw(int amount) throws LessMinimumBalanceException,InvalidWithdrawlException
    {        
        if(minimumBalance-amount<=5000){
            if(minimumBalance-amount<0){
                throw new InvalidWithdrawlException("Invalid Withdrawl Exception");
            }else{
                throw new LessMinimumBalanceException("Insufficient balance");
            }
        }else{
            minimumBalance=minimumBalance-amount;
            System.out.println("Available balance after withdrawl "+minimumBalance);
        }
    }
    void deposit(int amount){
        System.out.println("Balance Amount added "+amount);
        minimumBalance=minimumBalance+amount;
        System.out.println("Available balance "+minimumBalance);
    }
}

public class question4 {
    public static void main(String[] args) {
        try{
            BankAccount b1=new BankAccount();
            b1.deposit(1000);
            b1.withDraw(500);
        }catch(LessMinimumBalanceException l){
            l.printStackTrace();
        }catch(InvalidWithdrawlException e){
            e.printStackTrace();
        }
    }
}
