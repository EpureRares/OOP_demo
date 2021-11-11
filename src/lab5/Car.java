package lab5;

public class Car implements Vehicle {
    int speed = 0;
    int gear = 1;

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    @Override
    public String toString() {
        return " speed:" + speed + " gear:" + gear;
    }
}