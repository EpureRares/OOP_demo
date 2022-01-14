package lab11;

import java.util.Stack;
import java.util.function.BiPredicate;

public class MinStack<T> {
    T min;
    Stack<T> stack;
    Boolean isEmpty;
    BiPredicate<T, T> comparisonFunction;

    public MinStack(BiPredicate<T, T> comparisonFunction) {
        this.comparisonFunction = comparisonFunction;
        this.stack = new Stack<>();
        this.isEmpty = true;
    }

    public T top() {
        if (this.isEmpty) {
            System.out.println("The stack is empty.");
            return null;
        }
        return stack.peek();
    }

    public T getMin() {
        if (this.isEmpty) {
            throw new RuntimeException("The stack is empty. There is no minimum!");
        }
        return this.min;
    }

    private void updateMin() {
        T aux = stack.get(0);
        for (int i = 1; i < this.stack.size(); i++) {
            if (this.comparisonFunction.test(aux, stack.get(i))) {
                aux = stack.get(i);
            }
        }
        this.min = aux;
    }

    public T pop() {
        T removedElement = stack.pop();
        this.isEmpty = stack.isEmpty();
        if (!this.isEmpty && min == removedElement) {
            updateMin();
        }
        return removedElement;
    }

    public T push(T element) {
        T item = this.stack.push(element);
        this.isEmpty = stack.isEmpty();
        updateMin();
        return item;
    }
}
