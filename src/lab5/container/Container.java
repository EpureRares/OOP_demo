package lab5.container;

import java.util.ArrayList;

public abstract class Container {
    protected ArrayList<Integer> elements = new ArrayList<>();
    void push(int item) {
        this.elements.add(item);
    }
    abstract void pop();

    void printElements() {
        System.out.println(elements);
    }

}
