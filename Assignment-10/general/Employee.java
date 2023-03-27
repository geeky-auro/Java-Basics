package general;
public class Employee{
	public static String setEname;
    public static int setEmpno;
    protected int empId;
	private String name;
	public void earning(int basic,int HRA,int DA,String name1){
		this.name=name1;
	System.out.println("Name:"+name);
	System.out.println("Total Earning is "+ (basic+ DA*(0.8* basic)+ HRA*(0.15*basic)));
	}
}
