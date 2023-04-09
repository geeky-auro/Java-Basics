class CheckArgumentException extends Exception {
    String message;
    CheckArgumentException(String message){
        super(message);
        this.message=message;
    }
    @Override
    public String toString() {
        return this.message;
    }
}
public class question3 {
    public static void main(String[] args)throws CheckArgumentException {
        int sum =0;
        try {
            if (args.length<4) {
                throw new CheckArgumentException("Wrong number of arguments");
            }else{
            
                for(int i=0;i<args.length;i++){
                    sum=sum+(Integer.parseInt(args[i])*Integer.parseInt(args[i]));
                }
                System.out.println("Sum = " +sum);
            }    
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("Finally Sum is " +sum);
        }
        
    }
}
