package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestArrayList {

    public static void main(String[] args) {

        //["Mouse", "Laptop", "Keyboard"]
        List<String> products = new ArrayList<>();
        System.out.println("size(): " + products.size());
        products.add("Mouse");
        System.out.println("size(): " + products.size());
        products.add("Laptop");
        products.add("Keyboard");
        System.out.println("size(): " + products.size());
        // System.out.println(products.get(4));
        System.out.println(products);
        products.forEach(p -> System.out.println(p));
        for (String p : products) {
            System.out.println(p);
        }
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
        
    }
}
