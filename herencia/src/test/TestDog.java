package test;

import clases.Dog;
import padre.Animal;

public class TestDog {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        Dog dog = new Dog();
        dog.sound();
    }

}
