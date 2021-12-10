package lab9;

abstract class Pizza {
    public abstract double getPrice();
}
class HamAndMushroomPizza extends Pizza {
    public double getPrice() {
        return 8.5;
    }
}
class DeluxePizza extends Pizza {
    public double getPrice() {
        return 10.5;
    }
}
class HawaiianPizza extends Pizza {
    public double getPrice() {
        return 11.5;
    }
}

class PizzaFactory {
    public enum PizzaType {
        HamMushroom, Deluxe, Hawaiian
    }
    public static Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case HamMushroom: return new HamAndMushroomPizza();
            case Deluxe:      return new DeluxePizza();
            case Hawaiian:    return new HawaiianPizza();
        }
        throw new IllegalArgumentException("The pizza type " + pizzaType + " is not recognized.");
    }
}
public class PizzaLover {
    public static void main (String args[]) {
        for (PizzaFactory.PizzaType pizzaType : PizzaFactory.PizzaType.values()) {
            System.out.println("Price of " + pizzaType + " is " + PizzaFactory.createPizza(pizzaType).getPrice());
        }
    }
}