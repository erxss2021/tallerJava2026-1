package test;

import clases.Employee;
import clases.Product;
import generics.Box;
import generics.Util;

public class TestMethod {
    public static void main(String[] args) {
        Util.print("Java 21");
        Util.print(15.6);
        Util.print(new Employee("Juan"));
        Util.otrer();
        System.out.println(Util.duplicate(20));

        Box<String> box = new Box<>("Java 21", 2026);
        box.show(34);
        box.show(new Product("Mouse"));

        Box<Employee> box2 = new Box<>(new Employee("Juan"), true);
    }
}
