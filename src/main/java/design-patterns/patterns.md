Design Patterns
 
 
*  Create a Singleton Patterns example
*  Create a Decorator Pattern example
*  Create a Strategy Pattern example

*****
''''
public class Car implements Speeding{
    private String color;


    public  Car(){

    }
    public  Car(String color){
        this.color = color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void hoots() {
        if (color != null) {
            System.out.println("The " + color + "Car is hooting");
        } else {
            System.out.println("Car hooting!");
        }
    }

    public void drive() {
        if (color != null) {
            System.out.println("The" + color + "Car is driving");
        } else {
            System.out.println("Car driving");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.hoots();

        car.hoots();
        car.drive();
        car.accelerate();
    }

    public void accelerate() {
        System.out.println("Car accelerating");
    }
}
////