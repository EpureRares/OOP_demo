package lab5.container;

public class Stack extends Container{
    @Override
    void pop() {
        this.elements.remove(elements.size() - 1);
    }
}
