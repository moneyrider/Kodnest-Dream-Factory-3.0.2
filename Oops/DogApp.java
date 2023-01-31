public class DogApp {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Honey";
        d1.breed = "pug";
        

        Dog d2 = new Dog();
        d2.name = "Pluto";
        d2.breed = "pitbull";
        

        System.out.println("Dog 1 =" +d1.name);
        System.out.println("Dog 1 =" +d1.breed);
        d1.bark();
        System.out.println("Dog 2=" +d2.name);
        System.out.println("Dog 2 =" +d2.breed);
        d2.bark();

        
    }
    
}
class Dog{
    String name;
    String breed;
    void bark(){
        System.out.println("bhau bhau");
    }
}
