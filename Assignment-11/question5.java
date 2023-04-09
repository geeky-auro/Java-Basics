import java.util.Scanner;

class OverFlowException extends Exception {
    String message;
    OverFlowException(String message){
        super(message);
        this.message=message;
    }
    @Override
    public String toString() {
        return this.message;
    }
}
class UnderFlowException extends Exception {
    String message;
    UnderFlowException(String message){
        super(message);
        this.message=message;
    }
    @Override
    public String toString() {
        return this.message;
    }
}
class Stack{
    int arr[];
    int size;
    int counter=0;
    Stack(int size){
        arr=new int[size];
        this.size=size;
        counter=0;
    }
    void push(int x)throws OverFlowException{
        if(counter>=size){
            throw new OverFlowException("Stack Overflow");
        }
        arr[counter++]=x;
        System.out.println("Element added to stack is "+x);
    }

    int pop() throws UnderFlowException{
        if(counter<=0){
            throw new UnderFlowException("Stack Underflow");
        }
        int x=arr[--counter];
        return x;
    }

}
public class question5 {
    public static void main(String[] args) {
    try{
        System.out.println("Enter the size of the stack");
        Stack s=new Stack(5);
        s.push(5);
        s.push(10);
        System.out.println("Element at the top of the stack is "+s.pop());
        System.out.println("Element at the top of the stack is "+s.pop());
        System.out.println("Element at the top of the stack is "+s.pop());
    }catch(Exception e){
        e.printStackTrace();
    }     
    }
}
