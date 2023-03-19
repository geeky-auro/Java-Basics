public class inheritance1 {
   final int i;
   final void show(){
    System.out.println("Show");
   }
   inheritance1(int i){
    this.i=i;
   }
    public static void main(String[] args) {
    inheritance1 ob;
    // ob.i=20;
   } 
}

class inheritance2 extends inheritance1{
    int i;
    inheritance2(int i,int j){
        super(j);
        this.i=i;
        
    }
    
}
