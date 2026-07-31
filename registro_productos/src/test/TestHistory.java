package test;

import java.math.BigDecimal;

import models.Product;
import services.ProductHistoryAccessOrderService;
import services.ProductHistoryService;

public class TestHistory {

    public static void main(String[] args) {
        // ProductHistoryService service = new ProductHistoryService();
        ProductHistoryAccessOrderService service = new ProductHistoryAccessOrderService();
        service.registerConsult(new Product("SKU-001", "Laptop", new BigDecimal(15000)));
        service.registerConsult(new Product("SKU-002", "Mouse", new BigDecimal(150)));
        service.registerConsult(new Product("SKU-003", "Keyboard", new BigDecimal(550)));
        System.out.println("=========================================================");
        service.showHistory();
        service.registerConsult(new Product("SKU-001", "Laptop Gamer", new BigDecimal(30300)));
        System.out.println("=========================================================");
        service.showHistory();
        
        System.out.println("===================BUSCAR====================");
        System.out.println(service.findProduct("SKU-005"));
        System.out.println("=========================================================");
        service.showHistory();
        
        // System.out.println("=========================================================");
        // service.showHistory();
    }
}
