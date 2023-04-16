// package Assignment-12;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class question1 {
    public static void main(String[] args) throws IOException {
        
        try{
            FileReader fr = new FileReader("file1.txt");
            // FileReader will open that file from that
            // directory, if there is no file found it will
            // through an IOException
            // Creating a FileWriter object
            FileWriter fw = new FileWriter("fileOutput.txt");
            // Declaring a blank string in which
            // whole content of file is to be stored
            String str = "";

             // Condition check
            // Reading the file using read() method which
            // returns -1 at EOF while reading
            int i;
            while ((i = fr.read()) != -1) {
 
                // Storing every character in the string
                str += (char)i;
            }
            System.out.println(str);
            fw.write(str);
            fr.close();
            fw.close();
             // Display message
             System.out.println("File reading and writing both done");
        }catch(Exception e){
            System.out.println("There are some IOException");
        }  
    }
}
