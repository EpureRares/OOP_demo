package lab1;

import java.util.ArrayList;


public class Main {
    int i = 0;

    public static void main(String[] args) {

        // Exemplu ArrayList
        ArrayList<Dog> list = new ArrayList<>();

        Dog dog = new Dog();
        Cat cat = new Cat();

        list.add(dog);
        System.out.println(list.size());

        // Exemplu array
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        dogs[2] = new Dog();
        
        // for normal
        System.out.println("\n------Exemplu 1-------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(cat.isFriend(list.get(i)));
        }

        System.out.println("\n------Exemplu 2-------");
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(cat.isFriend(dogs[i]));
        }

        // for-each
        System.out.println("\n------Exemplu 3-------");
        for (Dog it : list) {
            System.out.println(cat.isFriend(it));
        }

        System.out.println(dog.getAge());
        dog.bark();
    }
}
