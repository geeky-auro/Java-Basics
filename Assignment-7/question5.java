import java.util.*;
public class question5 {
    public static void main(String arg[])
    {
        System.out.println("Enter the size of the list : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
       
        System.out.println("Enter the number ");

        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < size; i++)
        {
            int c = 1;

            if (arr[i] == -1) continue;
           
            for(int j = i+1; j < size; j++)
            {
                if(arr[i] == arr[j])
                {
                    c++;
                    arr[j] = -1;
                }
            }
            System.out.println(arr[i] + " : " + c);
         
        }
    }
}

    
