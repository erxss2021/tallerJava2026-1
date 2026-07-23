package test;

import java.util.HashSet;
import java.util.Set;

import clases.Employee;
import clases.Product;

public class TestProduct {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        products.add(new Product(1L, "Laptop"));
        products.add(new Product(1L, "Laptop"));
        System.out.println(products);

        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(1L, "Eloy"));
        employees.add(new Employee(1L, "ElOy"));
        employees.add(new Employee(1L, "Eloy"));
        System.out.println(employees);

    }
}
