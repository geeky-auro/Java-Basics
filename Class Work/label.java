public class label {
    int x;
    static int x1=10;
    void change(){
        x1++;
        System.out.println(x1);
    }
    public static void main(String[] args) {
        int array[][]=new int[2][2];
        int y=10;
        int x=y;
        label l=new label();
        l.change();
        System.out.println(x1);
        Task:
        for(int i=0; i<10; i++){
            if (i==8){
               break Task;
            }
            System.out.println("......."+i );
         }  
         System.out.println(Math.cbrt(8));
         System.out.println(Math.ceil(8.5));
         System.out.println(Math.ceil(8.7));
         System.out.println(Math.ceil(8.1));
         System.out.println(Math.floor(8.5));
         System.out.println(Math.floor(8.7));
         System.out.println(Math.floor(8.1));
         System.out.println(Math.log10(10));
         System.out.println(Math.random());
    }

    
    protected void finalize() {
        // TODO Auto-generated method stub
        
        System.out.println("Object Destroyed");
    }
}
