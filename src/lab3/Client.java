package lab3;

import lab3.paytypes.Card;
import lab3.paytypes.CreditCard;
import lab3.paytypes.PayType;
import lab3.products.Product;

import java.util.ArrayList;

public class Client {
    private String name;
    private String address;
    private ShoppingBag bag; // compunere
    private ArrayList<Product> boughtProducts; // compunere

    public String getName() {
        return name;
    }

    public Client(String name, String address) {
        this.name = name;
        this.address = address;
        this.bag = new ShoppingBag();
    }

    public void addProduct(Product product) {
        this.bag.addProduct(product);
    }

    public void checkout(PayType payType) {
        this.boughtProducts = this.bag.buy();

        if (payType instanceof Card) {
            ((Card)payType).payWithCard();
        }
        if (payType instanceof CreditCard) {
            ((CreditCard)payType).payWithCreditCard();
        }
    }

    public void consumeProducts() {
        for (Product p : boughtProducts) {
            p.consume();
        }
    }

    public void consumeProducts(int part, int idx) {
        boughtProducts.get(idx).consume(part);
    }

}
