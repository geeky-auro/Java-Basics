public class question2 {
	public static void main(String args[]){
	int arr[]=new int[10];
	for(int i=0;i<10;i++){
	arr[i]=Integer.parseInt(args[i]);
	}
	int evenCount=0;
	int oddCount=0;
	for(int i=0;i<10;i++){
	if(arr[i]%2==0){
		evenCount++;
	}else{
		oddCount++;
	}
	}
	System.out.println("Even Count :"+evenCount);
	System.out.println("Odd Count :"+oddCount);
	
	}    
}
