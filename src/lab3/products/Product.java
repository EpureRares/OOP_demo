package lab3.products;

import lab3.Provider;

public class Product {
    protected String name;
    /**
     * agregare: obiectul Provider poate continua sa existe chiar daca
     * obiectul Product nu exista
     */
    protected Provider provider;
    protected float price;

    public Product(String name, Provider provider, float price) {
        this.name = name;
        this.provider = provider;
        this.price = price;
    }

    public Product() {
        this(null, null, 0.0f);
    }

    public void consume() {
        System.out.println("Consume the product");
    }

    // supraincarcare
    public void consume(int part) {
        System.out.println("Consume the product");
    }
}
