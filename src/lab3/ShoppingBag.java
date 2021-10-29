package lab3;

import lab3.products.Product;

import java.util.ArrayList;

public class ShoppingBag {
    /**
    * compunere: array-list-ul products, nu poate exista daca
    * obiectul ShoppingBag nu exista
    * */
    private ArrayList<Product> products = new ArrayList<>();


    public void addProduct(Product product) {
        products.add(product); // Upcasting automat
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public ArrayList<Product> buy() {
        ArrayList<Product> bought = new ArrayList<>(products);
        products.clear();
        return bought;
    }
}
