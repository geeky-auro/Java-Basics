import java.io.FileReader;

public class randomFileExp {
    public static void main(String[] args)throws Exception {
        FileReader fr=new FileReader("randomFiles.txt");
        int i=0;
        String str="";
        int lineNo=1;
        while((i=fr.read())!=-1){
            if(i==10){
                lineNo++;
            }
            str=str+(char)i;
        }
        System.out.println(lineNo);
        System.out.println(str);
    }
}
