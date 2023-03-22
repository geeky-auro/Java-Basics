// package Assignment-9;

public class question5 {
    public static void main(String[] args) {
        Substaff s=new Substaff(500000, 20000, 3500, 2000, 1000, 2000);
        s.earnings();
    }
}

interface EmpProperties{
    void earnings();
    void deductions();
    void bonus();

}

abstract class Manager implements EmpProperties{
    int basic_pay,DA,HRA;
    Manager(int basic_pay,int DA,int HRA){
        this.basic_pay=basic_pay;
        this.HRA=HRA;
        this.DA=DA;
    }

    @Override
    public void earnings() {
        // TODO Auto-generated method stub
        double tot_earning=this.basic_pay+0.8*this.DA+0.15*HRA;
        System.out.println("Earning of a Manager "+tot_earning);
    }

    @Override
    public void deductions() {
        // TODO Auto-generated method stub
        System.out.println("Salary Deducted by Tax:"+0.12*this.basic_pay);
    }    
}

class Substaff extends Manager{
    int HRA1,DA1,basic_pay1;
    Substaff(int basic_pay1,int basic_pay,int DA1,int DA,int HRA1,int HRA){
        super(basic_pay,DA,HRA);
        this.basic_pay1=basic_pay1;
        this.DA1=DA1;
        this.HRA1=HRA1;
    }


    @Override
    public void earnings() {
        // TODO Auto-generated method stub
        super.earnings();
        double tot_earning=this.basic_pay1+0.8*this.DA+0.15*HRA;
        System.out.println("Earning of a Sub Staff "+tot_earning);
    }

    @Override
    public void deductions() {
        // TODO Auto-generated method stub
        super.deductions();
        System.out.println("Salary Deducted by Tax:"+0.12*this.basic_pay1);
    }

    @Override
    public void bonus() {
        // TODO Auto-generated method stub
        System.out.println("Bonus given to SubStaff "+ 0.5*basic_pay1);
    }
}


