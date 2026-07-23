package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import models.Product;

public class TestComparableProduct {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Product product = new Product(1L, "Laptop", 25000);
        products.add(new Product(4L, "Monitor", 2560));
        products.add(new Product(2L, "Mouse", 560));
        products.add(new Product(3L, "Keyboard", 560));
        products.add(product);
        products.add(new Product(5L, "Laptop Asus", 12560));
        products.forEach(p -> System.out.println(p));
        Collections.sort(products);
        System.out.println("====================Collections.sort()=================");
        products.forEach(p -> System.out.println(p));
    }

}
