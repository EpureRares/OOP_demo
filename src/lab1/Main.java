package lab1;

import java.util.ArrayList;
import java.util.Random;

class Dog {
    private int age = 3;
    public String name;

    /**
     *  Getter prin intermediul acesteia se poate
     *  lua valoarea unui anumit camp al clasei.
     * @return - valoarea campului age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter prin intermediul acestuia se poate
     * modifica valoarea unui anumit camp.
     * @param age - se da o valoare pentru campul age.
     */
    public void setAge(int age) {
        // prin cuvantul cheie this se face referire la obiectul curent.
        this.age = age;
    }

    void bark() {
        System.out.println("Ham ham");
    }
}

class Cat {
    String name;
    int age;

    boolean isFriend(Dog dog) {
        Random random = new Random();
        return random.nextBoolean();
    }

    void purrs() {
        System.out.println("Miau miau");
    }

    @Override
    public String toString() {
        // prin intermediul '+' se concateneaza informatia.
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {
    int i = 0;

    public static void main(String[] args) {
        int[] a = new int[20];

        ArrayList<Dog> list = new ArrayList<>();

        Dog dog = new Dog();
        Cat cat = new Cat();

        list.add(dog);
        System.out.println(list.size());

        // for normal
        for (int i = 0; i < list.size(); i++) {
            System.out.println(cat.isFriend(list.get(i)));
        }

        // for-each
        for (Dog it : list) {
            System.out.println(cat.isFriend(it));
        }

        System.out.println(dog.getAge());
        dog.bark();
    }
}
