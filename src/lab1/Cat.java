package lab1;

import java.util.Random;

public class Cat {
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
