public class question6 {
    public static void main(String[] args) {
        question6 q6=new question6();
        question6.Car c=q6.new Car("Maruti", "Toyata", "G6");
        question6.Car.Engine e=c.new Engine("Bigger");
        e.display();
    }
    class Car{
        String name;
        String brand;
        String model;
        Car(String name,String brand,String model){
            this.name=name;
            this.brand=brand;
            this.model=model;
        }
        class Engine{
            String engine;
            Engine(String engine){
                this.engine=engine;
            }
            void display(){
                System.out.println("Car Name:"+name);
                System.out.println("Brand:"+brand);
                System.out.println("Model:"+model);
                System.out.println("Engine Type:"+engine);
            }
        }
    }
}
