
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class filetest {

    public static void main(String[] args) throws IOException
    {
        File file=new File("data.txt");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        file.createNewFile();
        FileOutputStream fout=new FileOutputStream(file);
        System.out.println("Enter some integer to be stored:-");
        for(int i=0;i<=5;i++)
        {
            int a =Integer.parseInt(bf.readLine());
            fout.write(a);


        }
        fout.close();
        FileInputStream fileInputStream=new FileInputStream(file);
        System.out.println("Contents of the file:-");
        for (int i=0;i<=5 ;i++ ) {
            System.out.println(fileInputStream.read());

        }
        fileInputStream.close();

        File file1=new File("data.txt");
        FileInputStream copyinp=new FileInputStream(file1);
        System.out.println("Copied Contents of Original File:");
        for (int i=0;i<=5 ;i++ ) {
            System.out.println(copyinp.read());

        }
        copyinp.close();
    

    }
}
