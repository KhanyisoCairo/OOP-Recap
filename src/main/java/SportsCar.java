public class SportsCar extends Car implements Speeding {

    public void hoots() {
        System.out.println("Sport cars don't hoot");
    }
    public void drive(){
        System.out.println("Sports car driving fast");
    }

    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.hoots();
        sportsCar.drive();
        sportsCar.accelerate();
    }

    public void accelerate() {
        System.out.println("Sports car accelerating");
    }
}
