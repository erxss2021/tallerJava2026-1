package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import models.Product;

public class ProductManager {
    private final List<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }
    
    public void addProduct(Product product){
        products.add(product);
    }

    public Product getProduct(int index){
        return products.get(index);
    }

    public void replaceProduct(int index, Product product){
        products.set(index, product);
    }

    public void insertProduct(int index, Product product){
        products.add(index, product);
    }

    public Product removeProduct(int index){
        return products.remove(index);
    }

    public Optional<Product> findByName(String name){
        for (Product product : products) {
            if (product.name().equalsIgnoreCase(name)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    public void printAllProduct(){
        for (Product product : products) {
            System.out.println(product);
        }
        // products.forEach(System.out::println);
    }


}
