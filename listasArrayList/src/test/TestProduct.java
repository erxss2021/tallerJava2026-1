package test;

import models.Product;
import services.ProductManager;

public class TestProduct {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        System.out.println("=============Agregar productos=================");
        Product product = new Product(1L, "Laptop", 25000);
        manager.addProduct(product);
        manager.addProduct(new Product(2L, "Mouse", 650));
    }
}
