import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// package Assignment-12;

public class question3 {
    public static void main(String[] args) throws IOException {
        try{
            FileReader fr = new FileReader("file1.txt");
            String str = "";

            int i;
            while ((i = fr.read()) != -1) {
            // Storing every character in the string
            str += (char)i;
            }
            System.out.println("Text Before Editing ="+str);
            String words[]=str.split("\\s");  
            String capitalizeWord="";  
            for(String w:words){  
                String first=w.substring(0,1);  
                String afterfirst=w.substring(1);  
                capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
            }  
            System.out.println("Text After Editing ="+capitalizeWord);
            FileWriter fw = new FileWriter("file1.txt");
            fw.write(capitalizeWord);
            fw.close();
            fr.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
