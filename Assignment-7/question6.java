import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int arr1[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            arr1[i]=sc.nextInt();
        }
        int mergedArray[]=new int[10];
        int i=0,j=0,k=0;
        while(i<5 && j<5 && k<10){
            if(arr[i]<arr1[j]){
                mergedArray[k++]=arr[i++];
            }else{
                mergedArray[k++]=arr1[j++];
            }
        }

        while(i<5){
            mergedArray[k++]=arr[i++];
        }
        while(j<5){
            mergedArray[k++]=arr[j++];
        }

        for (int x : mergedArray) {
            System.out.println(x);
        }
    }
}
