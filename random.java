import java.util.*; 
public class random { 
    public static void main(String[] args) 
    { 
  
        // create random object 
        Random ran = new Random(); 
        int nxt,c=0;
        // generating integer 
        while(true)
        {
            c++;

          nxt = ran.nextInt(4);  
          System.out.println(nxt);
          if(nxt==2)
          {
            break;
          } 
        }
        
  
        // Printing the random Number 
        System.out.println("The Randomly generated integer is : " + nxt); 
        System.out.println("Count:"+c);
    } 
} 