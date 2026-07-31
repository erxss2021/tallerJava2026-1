package services;

import java.util.HashMap;
import java.util.Map;

import models.ProductStadistics;

public class SalesProductStadisticsService {

    private final Map<String, ProductStadistics> sales;

    public SalesProductStadisticsService() {
        sales = new HashMap<>();
    }

    public void registerSale(String productCode, int units){
        //(oldValue, newValue) -> oldValue + newValue --> Integer::sum
        sales.compute(productCode, (key, current) -> {
            if (current == null) {
                return new ProductStadistics(key, units);
            }
            return new ProductStadistics(key, current.totalunits() + units);
        });
    }    

    // public int getSales(String productCode){
    //     return sales.getOrDefault(productCode, 0);
    // }

    // public void registerProduct(String productCode){
    //     sales.putIfAbsent(productCode, 0);
    // }

    // public void addBonus(String productCode){
    //     sales.computeIfPresent(productCode, (code, units) -> units + 10);
    // }

    // public void initializeCounter(String productCode){
    //     sales.computeIfAbsent(productCode, code -> 0);
    // }

    public void showStadistics(){
        sales.forEach((product, units) -> System.out.println(product + " -> " + units));
    }

}
