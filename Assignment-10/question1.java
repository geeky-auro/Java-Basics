import Marketing.sales;
import general.*;

public class question1 {

    public static void main(String[] args) {
        sales e[]=new sales[5];
        for(int i=0;i<5;i++){
            e[i]=new sales();
            e[i].setEmpno=i+1;
            e[i].setEname="test";
        }

        for (int i = 0; i < e.length; i++) {
            System.out.println("Employee "+i);
            e[i].earning(100000, 1000, 500,"test"+i);
            e[i].travelAllowance(10000);
        }


    }
}
