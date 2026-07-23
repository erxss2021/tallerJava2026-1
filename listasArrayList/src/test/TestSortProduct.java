package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import models.Product;

public class TestSortProduct {
    public static void main(String[] args) {

        final Comparator<Product> ORDER_NATURAL = Comparator.comparingDouble(Product::price);
        List<Product> products = new ArrayList<>();
        Product product = new Product(1L, "Laptop", 25000);
        products.add(product);
        products.add(new Product(2L, "Mouse", 560));
        products.add(new Product(4L, "Monitor", 2560));
        products.add(new Product(3L, "Keyboard", 560));
        products.add(new Product(5L, "Laptop Asus", 12560));
        products.forEach(p -> System.out.println(p));
        products.sort(ORDER_NATURAL);
        System.out.println("=============sort()=====================");
        products.forEach(System.out::println);
        products.sort(Comparator.comparing(Product::name));
        System.out.println("=============sort()=====================");
        products.forEach(System.out::println);
        products.sort(Comparator.comparingLong(Product::id));
        System.out.println("=============sort()=====================");
        products.forEach(System.out::println);
        products.sort(Comparator.comparingDouble(Product::price)
        .thenComparing(Product::name));
        System.out.println("=============sort()=====================");
        products.forEach(System.out::println);
        products.sort(Comparator.comparingDouble(Product::price)
        .thenComparing(Product::name).reversed());
        System.out.println("=============sort()=====================");
        products.forEach(System.out::println);
        products.sort(ORDER_NATURAL);
        System.out.println("=============sort()=====================");
        products.forEach(System.out::println);
        // Collections.sort(products);
    }

}
