package lab11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;

public class Test {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> predicate1 = (a, b) -> (a > b);
        MinStack<Integer> minStack1 = new MinStack<>(predicate1);

        minStack1.push(1);
        minStack1.push(34);
        minStack1.push(-1);
        minStack1.push(23);
        System.out.println("[MinStack]: Top = " + minStack1.top());
        System.out.println("[MinStack]: Min = " + minStack1.getMin());
        System.out.println("[MinStack]: Pop = " + minStack1.pop());
        System.out.println("[MinStack]: Pop = " + minStack1.pop());
        System.out.println("[MinStack]: Min = " + minStack1.getMin());
        System.out.println("[MinStack]: Top = " + minStack1.top());
        System.out.println("[MinStack]: Pop = " + minStack1.pop());
        System.out.println("[MinStack]: Pop = " + minStack1.pop());

        Student s1 = new Student("Gigel1" , 8.23);
        Student s2 = new Student("Gigel2", 6.3);
        Student s3 = new Student("Gigel3", 10);
        Student s4 = new Student("Gigel3", 7.3);
        BiPredicate<Student, Student> predicate2 = (a, b) -> (a.getAverageGrade() > b.getAverageGrade());
        MinStack<Student> stack = new MinStack<>(predicate2);

        System.out.println("\n---------------------");
        stack.push(s1);
        stack.push(s2);
        stack.push(s3);
        stack.push(s4);
        System.out.println("[MinStack]: Top = " + stack.top());
        System.out.println("[MinStack]: Min = " + stack.getMin());
        System.out.println("[MinStack]: Pop = " + stack.pop());
        System.out.println("[MinStack]: Pop = " + stack.pop());
        System.out.println("[MinStack]: Min = " + stack.getMin());
        System.out.println("[MinStack]: Top = " + stack.top());
        System.out.println("[MinStack]: Pop = " + stack.pop());
        System.out.println("[MinStack]: Pop = " + stack.pop());

        System.out.println("\n--------------------");
        s1.printSomeInfo(new ArrayList<>(List.of(10,8,6,9)));
    }
}
