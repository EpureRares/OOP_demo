package lab3;

import lab3.paytypes.Card;
import lab3.paytypes.CreditCard;
import lab3.paytypes.PayType;
import lab3.products.Apple;
import lab3.products.Bread;
import lab3.products.Product;

public class Main {
    public static void main(String[] args) {
        Provider provider = new Provider("Someone", "Somewhere");

        Product p1 = new Apple("red apple", provider, 0.5f, "Anywhere");
        Product p2 = new Bread("simple bread", provider, 1.5f, "Flour and water");



        Client c1 = new Client("Anyone", "There");
        Client c2 = new Client("Anyone", "There");

        PayType card = new Card();
        PayType creditCard = new CreditCard();


        c1.addProduct(p1);
        c1.addProduct(p2);


        c1.checkout(card);
        System.out.println("Client, " + c1.getName() + ", has bought some products");

        System.out.println("\nClient, " + c1.getName() + ", consumes some products");
        c1.consumeProducts();

        c2.addProduct(p2);
        c2.addProduct(p2);
        System.out.println("\nClient, " + c2.getName() + ", has bought some products");
        c2.checkout(creditCard);

        System.out.println("\nClient, " + c2.getName() + ", consumes some products");
        c2.consumeProducts();
        c2.consumeProducts(10, 1);


    }
}
