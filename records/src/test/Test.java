package test;

import records.Person;
import records.Rectangle;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Eloy", 41);
        System.out.println(person);
        System.out.println(person.name());
        Person person2 = new Person("Eloy", 41);
        System.out.println(person.equals(person2));

        System.out.println("---------------Rectangle-----------------");
        Rectangle rectangle = new Rectangle(6 , 5);
        System.out.println("Area: " + rectangle.area());
        Rectangle.square(4);
    }
}
