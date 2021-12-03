package lab8.sort;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(2005, 5999));
        carList.add(new Car(2010, 4044));
        carList.add(new Car(2018, 20000));
        carList.add(new Car(2010, 5000));

        Collections.sort(carList);
        carList.forEach(System.out::println);
        System.out.println("----------------");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ana", 1));
        students.add(new Student("Mihai", 10));
        students.add(new Student("George", 5));
        students.add(new Student("Georgiana", 4));

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getID() - o1.getID();
            }
        });

        students.forEach(System.out::println);
        System.out.println("----------------");
        students.sort((o1, o2) -> o1.getID() - o2.getID());
        students.forEach(System.out::println);

        Map<String, Integer> products = new TreeMap<>();
        products.put("Apa", 2);
        products.put("Paine", 2);
        products.put("Lapte", 1);
        products.put("Cereale", 3);

        products.forEach((key, value) -> System.out.println("(" + key + ", " + value + ")"));
        System.out.println("----------------");

        products.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        Iterator<Integer> iter = numbers.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
