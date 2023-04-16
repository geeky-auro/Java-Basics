import java.io.File;
import java.io.FileReader;

/**
 * 
 * To check if a file exists or not using FileReader in Java, you can create a File object with the path to the file, and then use the exists() method to check if the file exists. 
 * 
 * 
 */

public class question5 {
    public static void main(String[] args)throws Exception {
        for(int i=0;i<args.length;i++) {
            int j=0;
            String str="";
            File file=new File(args[i]);
            if(file.exists()){
                try{
                    FileReader fr=new FileReader(file);
                      
            int lineCount=0;
            while((j=fr.read())!=-1){
                if(j==10){
                    lineCount++;
                }
            str=str+(char)j;  
            }
            fr.close();
            int wordCount=0,charCount=0;
            String word="";
            for(int l=0;l<str.length();l++){
                char ch=str.charAt(l);
                charCount++;
                if(ch!=' '){
                    word=word+ch;
                }else if(!word.isEmpty()){
                    wordCount++;
                    word = "";
                }
            }
            System.out.println("Name of the File is "+args[i]);
            System.out.println("No. of Lines "+lineCount);
            System.out.println("No. of Words "+wordCount);
            System.out.println("No of Characters "+charCount);
            }catch(Exception e){
            System.out.println(e.getMessage());
            }
            }else{
                System.out.println("File not found");
            }

        }
    }
}
