import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// package Assignment-12;

public class question2 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("file1.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("fileOutput.txt"));
        String line1 = reader1.readLine();
        String line2 = reader2.readLine();
        boolean areEqual = true;
        int lineNum = 1;
        while (line1 != null || line2 != null)
        {
            if(line1 == null || line2 == null)
            {
                areEqual = false;
                 
                break;
            }
            else if(! line1.equalsIgnoreCase(line2))
            {
                areEqual = false;
                 
                break;
            }
             
            line1 = reader1.readLine();
             
            line2 = reader2.readLine();
             
            lineNum++;
        }
        if(areEqual)
        {
            System.out.println("Two files have same content.");
        }
        else
        {
            System.out.println("Two files have different content. They differ at line "+lineNum);
        }
        reader1.close();
        reader2.close();
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }
}
