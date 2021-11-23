public class largerarr
{
	public static void main(String args[])
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	int arr[]=new int[3];
	int i=0;
	for(i=0;i<arr.length;i++)
	{
	System.out.println("Enter a number:-");
	arr[i]=sc.nextInt();
	}
	if(arr[0]> arr[1] && arr[0]>arr[2])
	{
		System.out.println(arr[0]+" is the Largest Number.");
	}
	else if(arr[1]>arr[2])
	{
		System.out.println(arr[1]+" is the Largest Number.");
	}
	else
	{
		System.out.println(arr[2]+" is the Largest Number.");
	}
	}
}