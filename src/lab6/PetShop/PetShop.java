package lab6.PetShop;

import java.util.List;

class PetShop {
    abstract class Animal {
        protected String name;
        protected int year;

        public abstract void makeSound();
    }

    private List<Animal> animals;
}

class Dog extends PetShop.Animal {

    public Dog(PetShop shop) {
        shop.super();
    }

    @Override
    public void makeSound() {
        System.out.println("BARK");
    }
}

class Cat extends PetShop.Animal {

    public Cat(PetShop shop) {
        shop.super();
    }

    @Override
    public void makeSound() {
        System.out.println("MIAU");
    }
}

