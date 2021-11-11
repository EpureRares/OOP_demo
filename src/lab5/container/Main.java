package lab5.container;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new Queue();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printElements();
        stack.pop();
        stack.printElements();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.printElements();
        queue.pop();
        queue.printElements();
    }
}
