public class question5 {
    public static void main(String[] args) {
        question6 q=new question6();
        question6.Derived d=q.new Derived(10, 20);
    }

    class Base{
        int x;
        Base(int x){
            this.x=x;
        }
    }
    class Derived extends Base{
        int y;
        Derived(int x,int y){
            super(x);
            this.y=y;
        }
    }
}
