package lab5.vehicle;

public class AutonomousCar implements Driver,Vehicle{
    int speed = 0;
    int gear = 1;

    @Override
    public void drive() {
        this.changeGear(3);
        System.out.println("Change gear: " + gear);

        this.speedUp(40);
        System.out.println("SpeedUP: " + speed);

        System.out.println("Turn Left.... and see Doctor");
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }
}
