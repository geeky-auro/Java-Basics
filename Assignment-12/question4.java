import java.io.*;
public class question4 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("file1.txt");
        String str = "";
        int i;
        while ((i = fr.read()) != -1) {
        // Storing every character in the string
        str += (char)i;
        }
        String maxWord="";
        String tempWord="";
        for(int j=0;j<str.length();j++) {
            char ch=str.charAt(j);
            if(ch!=' '){
                tempWord=tempWord+ch;
                continue;
            }else{
                if(tempWord.length()>maxWord.length()){
                    maxWord=tempWord;
                }
                    tempWord="";
            }
        }
        System.out.println("Longest Word is " + maxWord);
    }
}
