package lab3.products;

import lab3.Provider;

public class Apple extends Product {
    private String origin;

    public Apple(String name, Provider provider, float price, String origin) {
        super(name, provider, price);
        this.origin = origin;
    }

    // suprascriere
    @Override
    public void consume() {
        System.out.println("Eat apple from " + origin);
    }

    // supraincarcare
    public void consume(int part) {
        System.out.println("Eat just " + part +"% of an apple from " + origin);
    }
}
