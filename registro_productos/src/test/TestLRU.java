package test;

import java.math.BigDecimal;

import models.Product;
import services.ProductHistoryLRU;

public class TestLRU {
    public static void main(String[] args) {
        ProductHistoryLRU lru = new ProductHistoryLRU();

        for (int i = 1; i <= 10; i++) {
            lru.put("P" + i, new Product("P"+ i, "Producto " + i, new BigDecimal(i)));
        }
        lru.forEach((k, v) -> System.out.println(k + " -> " + v));
        
        lru.put("p11", new Product("P11", "Producto 11", new BigDecimal(11)));
        System.out.println("======================================================");
        lru.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

}
