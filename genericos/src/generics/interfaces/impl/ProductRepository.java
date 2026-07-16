package generics.interfaces.impl;

import clases.Product;
import generics.interfaces.Repository;

public class ProductRepository implements Repository<Product> {

    
    @Override
    public void save(Product product) {
        System.out.println("Save product...");
    }

    @Override
    public Product findById(Long id) {
        return new Product("Mouse");
    }

}
