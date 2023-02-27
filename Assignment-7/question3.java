import java.util.Scanner;
public class question3{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No. of elements to be entered");
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
	}
	for(int i=0;i<n-1;i++){
	for(int j=0;j<n-i-1;j++){
	if(arr[j]>arr[j+1]){
	int temp=arr[j];
	arr[j]=arr[j+1];
	arr[j+1]=temp;
	}
	}
	}
	
	for(int x:arr){
	System.out.println(x);
	}
		
}
}
