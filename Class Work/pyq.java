import java.util.Scanner;

/**
 * pyq
 */
public class pyq {
    public class Inner{

    }
    public void someOuterMethod(){
        new Inner();
    }
    public static void main(int x) {
        System.out.println("one argu");
    }
    public static void main(int x,int y) {
        System.out.println("Two int argu");
    }
    public static void main(boolean args) {
        System.out.println("bool argu");
    }
    public static void main(String[] args) {
        main(1);
        main(2,3);
        main(false);
        /*
         * O/p: one argu
         * Two int argu
         * bool argu
         */
        Long x;
        pyq p=new pyq();
        // Error ;0
        // new pyq.Inner();
        System.out.println("Enter n Numbers ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==-2){
                    continue;
                }else
                if(arr[i]==arr[j]){
                    arr[j]=-2;
                    count++;
                }
            }
            if(count==0 && arr[i]!=-2){
                System.out.println(arr[i]);
            }
        }




        
    }
}