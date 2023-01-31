public class CarApp {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "maruti";
        c.color = "blue";
        c.price = 12000;
        c.accelerate();
        System.out.println("Brand =" +c.brand );
        System.out.println("Color =" +c.color);
        System.out.println("Price=" +c.price );

        
    }

    
}
 class Car{
    String brand;
    String color;
    int price;
    void accelerate(){
        System.out.println("A car Accelerates");
    }

}
