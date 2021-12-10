package lab9;

import java.util.ArrayList;
import java.util.List;

interface PaymentStrategy {
    void pay(int amount);
}

class PaypalStrategy implements  PaymentStrategy {
    private String email;
    private String password;

    PaypalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal");
    }
}

class CreditCartStrategy implements  PaymentStrategy {
    private String name;
    private String ccNumber;
    private String cvv;
    private String dateOfExpiry;

    CreditCartStrategy(String name, String ccNum, String cvv, String dateOfExpiry) {
        this.name = name;
        this.ccNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card");
    }
}

class Item {
    private int price;

    Item(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class ShoppingCart {
    static List<Item> items = new ArrayList<>();

    public static void addItem(Item i) {
        items.add(i);
    }

    private static int calculateTotal() {
        int sum = 0;
        for (Item i : items) {
            sum += i.getPrice();
        }

        return sum;
    }

    public static void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }

    public static void main (String args[]) {
        Item item1 = new Item(10);
        Item item2 = new Item(54);

        addItem(item1);
        addItem(item2);

        pay(new PaypalStrategy("mail@oop.java", "parola"));
        pay(new CreditCartStrategy("OOP", "0128769523", "658", "12/21"));

    }
}
