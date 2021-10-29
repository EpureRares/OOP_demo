package lab3.products;

import lab3.Provider;

public class Bread extends Product {
    private String ingredients;

    public Bread(String name, Provider provider, float price, String ingredients) {
        super(name, provider, price);
        this.ingredients = ingredients;
    }

    // suprascriere
    @Override
    public void consume() {
        System.out.println("Eat bread make from " + ingredients);
    }

    // supraincarcare
    public void consume(int part) {
        System.out.println("Eat just " + part +"% of bread make from " + ingredients);
    }
}
