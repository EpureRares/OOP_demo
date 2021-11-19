package lab6;

import lab6.Operation.Operation;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Class.Inner inner = new Class.Inner();

        inner.print("Ceva test aici");

        Operation operation = new Operation();

        System.out.println(operation.getBasicOperation("-") + " " + operation.getTypeLastOperation());
        System.out.println(operation.getBasicOperation("+") + " " + operation.getTypeLastOperation());
        System.out.println(operation.getBasicOperation("*") + " " + operation.getTypeLastOperation());

        // Metode Lambda.
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
          list.add(i);
        }

        list.removeIf((x) -> x > 10);
        list.forEach((x) -> System.out.print(x + " "));
    }
}