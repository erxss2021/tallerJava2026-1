package services;

import java.util.HashSet;
import java.util.Set;

import models.Product;

public class ProductRegistry {
    private final Set<Product> products;

    public ProductRegistry() {
        this.products = new HashSet<>();
    }

    public boolean registerProduct(Product product){
        boolean skuExits = false;
        for (Product p : products) {
            if (p.sku().equals(product.sku())) {
                skuExits = true;
                break;
            }
        }
        if (skuExits) {
            return false;
        }
        return products.add(product);
    }

    public boolean containsProduct(Product product){
        return products.contains(product);
    }

    public boolean removeProduct(Product product){
        return products.remove(product);
    }

    public void showAllProducts(){
        products.forEach(p -> System.out.println(p));
    }

}
