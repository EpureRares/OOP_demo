package lab5.vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.speedUp(10);
        System.out.println(car);

        AutonomousCar autoCar = new AutonomousCar();
        autoCar.drive();
    }
}
