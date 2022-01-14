package lab11.boundedWildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Application {
    public static void printList(List<Object> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static void printListWildcard(List<?> list) {
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String>  ls = Arrays.asList("one", "two", "three");
        printListWildcard(li);
        printListWildcard(ls);

        List<Integer> l  = new ArrayList<>();
        addNumbers(l);
        System.out.println(l);

        List<Integer> lint = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + sumOfList(lint));

        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + sumOfList(ld));
    }
}
