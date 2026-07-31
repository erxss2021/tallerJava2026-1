import services.SalesProductStadisticsService;
import services.SalesStadisticsService;

public class App {
    public static void main(String[] args) {
        SalesStadisticsService service = new SalesStadisticsService();
        service.registerProduct("P001");
        service.registerSale("P001", 10);
        service.registerSale("P001", 5);
        service.registerSale("P002", 12);
        service.initializeCounter("P003");
        service.registerSale("P003", 5);
        service.addBonus("P002");
        System.out.println("Ventas P001: " + service.getSales("P001"));

        System.out.println("=====================================");
        service.showStadistics();

        SalesProductStadisticsService service2 = new SalesProductStadisticsService();
        service2.registerSale("P001", 10);
        service2.registerSale("P002", 10);
        service2.registerSale("P002", 10);

        System.out.println("=========================================");
        service2.showStadistics();


    }
}
