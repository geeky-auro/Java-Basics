import Marketing.sales;

public class question1 {

    public static void main(String[] args) {
        sales e[]=new sales[5];
        for(int i=0;i<5;i++){
            e[i]=new sales();
            e[i].setEmpno=(int)(Math.random()*1+Math.random()*100+Math.random()*1000+Math.random()*10000);
            e[i].setEname="test";
        }

        for (int i = 0; i < e.length; i++) {
            System.out.println("Employee ID:"+e[i].getEmpno());
            e[i].earning(100000, 1000, 500,"test"+i);
            e[i].travelAllowance(10000);
        }


    }
}
