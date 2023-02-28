import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Stream {
    /*
     * STream an abstraction of a source or target of data
     * 8-bit bytes flow to (Output) and from Input Streams
     * Can represent many datasources:
     * Files on Hard Drive 
     * Another Computer on Network
     * Web Page
     * Input Device (Keyboard,Mouse)
      
     * Include java.io package use I/O streams
     * Note Streams perform I/O in Java
     *  An abstraction that either produces or consumes information
     * LINKED TO A PHYSICAL DEVICE BY THE JAVA I/0 SYSTEM
     * Same I/O Classes and methods can be applied to different types of devices. 
     * 
     * It is of two types:-
     * i)Byte Stream : Need to define two Abstract Classes i.e InputStream and OutputStream
     * ii)Character Stream: Need to define two Abstract Classes i.e Reader and Writer
     * Two important methods in both of them is read() and write()
     * Predefined Streams
     * ================================
     * System.out->Console
     * System.in->Keyboard
     * System.err->Console
     * 
     * Buffered Reader Class
     */

     public static void main(String[] args)throws Exception {
      // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      //   System.out.println("Enter Characters ");
      //   int n=Integer.parseInt(br.readLine());
      //   System.out.println("Entered No is "+n);
      /*
       * Below is the Reading of Characters from a file ;-|
       */
      BufferedReader br =new BufferedReader(new FileReader("myfile.txt"));
      char ch[]=new char[100];
      if(br.ready()){
        System.out.println(br.readLine());
        br.read(ch);
        for(int i=0;i<ch.length;i++){
          System.out.print(ch[i]);
        }
        // br.reset();
      }
      System.out.println();

    }
}
