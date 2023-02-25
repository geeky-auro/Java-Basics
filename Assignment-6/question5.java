import java.util.Scanner;

// package Assignment-6;

class Number{
    int number;
    int min,max;
    void read(){
        System.out.println("Enter a Number ");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
    }

    void swap(){
        
        int temp=min;
        min=max;
        max=temp;
    }

    void display(){
        System.out.println("Maximum after swapping:"+min);
        System.out.println("Minimum after swapping:"+max);
    }
}

public class question5 {
    
    public static void main(String[] args) {
    
        System.out.println("Enter n No. of Numbers");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Number n[]=new Number[x];
        for(int i=0;i<n.length;i++){
            n[i]=new Number();
            n[i].read();
        }
        
        question5 q5=new question5();
        q5.compare(n);
        Number ni=new Number();
        ni.min=n[0].min;
        ni.max=n[0].max;
        ni.display();



    }
    void compare(Number n[]){
        int min=n[0].number,max=n[0].number;
        for(int i=1;i<n.length;i++){
            if(n[i].number>max){
                max=n[i].number;
            }
            if(n[i].number<min){
                min=n[i].number;
            }
        }
        for(int i=0;i<n.length;i++){
            n[i].min=min;
            n[i].max=max;
        }
    }
}

