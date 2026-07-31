package services;

import java.util.LinkedHashMap;
import java.util.Map;

import models.Product;

public class ProductHistoryService {
    private final Map<String, Product> history;

    public ProductHistoryService() {
        history = new LinkedHashMap<>();
    }
    
    public void registerConsult(Product product){
        history.put(product.sku(), product);
    }

    public Product findProduct(String sku){
        return history.get(sku);
    }

    public void showHistory(){
        if (history.isEmpty()) {
            System.out.println("Historial vacio.");
            return ;
        }

        history.forEach((sku, product) -> System.out.println(sku + " -> " + product ));
    }
}
