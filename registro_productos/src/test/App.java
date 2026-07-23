package test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import models.Product;
import models.ProductTraditional;
import services.ProductRegistry;

public class App {
    public static void main(String[] args){

        ProductRegistry registry = new ProductRegistry();
        
        Product product = new Product("SKU-001", "Laptop", new BigDecimal(15000));
        Product product2 = new Product("SKU-002", "Laptop", new BigDecimal(15000));
        Product product3 = new Product("SKU-001", "Laptop Gamer", new BigDecimal(25000));
        
        System.out.println("Laptop: " + registry.registerProduct(product));
        System.out.println("Mouse: " + registry.registerProduct(product2));
        System.out.println("Gamer: " + registry.registerProduct(product3));
        registry.showAllProducts();

        System.out.println("=============BUSCAR PRODUCTO================0");
        System.out.println(registry.containsProduct(product3));

        System.out.println("====================ELIMINAR PRODUCTO==================");
        System.out.println(registry.removeProduct(product3));
        
        // Set<Product> products = new HashSet<>();
        // products.add(product);
        // products.add(product2);
        // System.out.println(products);
        
        // ProductTraditional productT1 = new ProductTraditional("SKU-001", "Laptop", new BigDecimal(15000));
        // ProductTraditional productT2 = new ProductTraditional("SKU-001", "Laptop", new BigDecimal(15000));
        // Set<ProductTraditional> productsT = new HashSet<>();
        // productsT.add(productT1);
        // productsT.add(productT2);
        // System.out.println("===============================================");
        // System.out.println(productsT);
    }

}
