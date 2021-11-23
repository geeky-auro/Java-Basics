import java.util.*;
public class mergeascend
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[b.length+a.length];
		int i=0,j=0,k=0;
		for (i=0;i<a.length ;i++ ) {
			System.out.println("Enter a elment:-");
			a[i]=sc.nextInt();
		}
		for (j=0;j<b.length ;j++ ) {
			System.out.println("Enter a elment:-");
			b[j]=sc.nextInt();
		}
		i=0;
		j=0;
		k=0;

		while(i<a.length && j<b.length) 
		{
		if(a[i]<b[j])
		{
			c[k++]=a[i++];
		}	
		else
		{
			c[k++]=b[j++];
		}
		}

		// Store remaining elements of first array
        while (i< a.length)
            c[k++] = a[i++];
     
        // Store remaining elements of second array
        while (j< b.length)
            c[k++] = b[j++];

        for (int x : c) {
        	System.out.println(x);
        }
        	
        
    }
}