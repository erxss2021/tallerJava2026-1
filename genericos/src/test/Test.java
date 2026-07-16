package test;

import clases.Employee;
import clases.Product;
import generics.Box;
import generics.Pair;
import generics.Response;

public class Test {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Laptop", 15);
        System.out.println(pair.getKey() + " --> " + pair.getValue());


        Pair<String, Product> productPair = new Pair<>("A100", new Product("Mouse"));
        System.out.println(productPair.getKey() + " --> "  + productPair.getValue().getName());


        Response<Employee, String> response = new Response<>(null, "Empleado inexistente");
        System.out.println(response.getData().getName() + " -> " + response.getError());
        
        Response<Employee, String> response2 = new Response<>(
            new Employee("Juan"), null);
            System.out.println(response2.getData().getName() + " -> " + response2.getError());
        
        // System.out.println(pair.getValue());
        // Box<Integer> box = new Box<>();
        // box.setValue(100);
        // int result = box.getValue() + box.getValue();
        // System.out.println(result);

        // Box<String> box2 = new Box<>();
        // box2.setValue("Box 2");
        // System.out.println(box2.getValue());

        // Box<Employee> boxEmployee = new Box<>();
        // boxEmployee.setValue(new Employee("Eloy"));
        // System.out.println(boxEmployee.getValue());

        // Employee employee = boxEmployee.getValue();
        // System.out.println(employee.getName());
    }
}
