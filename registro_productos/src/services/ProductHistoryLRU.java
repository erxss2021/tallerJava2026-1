package services;

import java.util.LinkedHashMap;

import models.Product;

public class ProductHistoryLRU extends LinkedHashMap<String, Product>{
    

    public ProductHistoryLRU() {
        super(16, 0.75f, true);
    }

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<String, Product> eldest) {
        return size() > 10;
    }
    
}
