package lab5.container;

public class Queue extends Container{

    @Override
    void pop() {
        this.elements.remove(0);
    }
}
