package services;

import java.util.HashMap;
import java.util.Map;

public class SalesStadisticsService {

    private final Map<String, Integer> sales;

    public SalesStadisticsService() {
        sales = new HashMap<>();
    }

    public void registerSale(String productCode, int units){
        //(oldValue, newValue) -> oldValue + newValue --> Integer::sum
        sales.merge(productCode, units, Integer::sum);
    }    

    public int getSales(String productCode){
        return sales.getOrDefault(productCode, 0);
    }

    public void registerProduct(String productCode){
        sales.putIfAbsent(productCode, 0);
    }

    public void addBonus(String productCode){
        sales.computeIfPresent(productCode, (code, units) -> units + 10);
    }

    public void initializeCounter(String productCode){
        sales.computeIfAbsent(productCode, code -> 0);
    }

    public void showStadistics(){
        sales.forEach((product, units) -> System.out.println(product + " -> " + units));
    }

}
