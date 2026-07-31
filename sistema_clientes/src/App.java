import models.Customer;
import services.CustomerService;

public class App {
    public static void main(String[] args){
        CustomerService service = new CustomerService();
        service.registerCustomer(new Customer("C001", "Carlos Lopez", "carlos@gmail.com"));
        service.registerCustomer(new Customer("C002", "Ana Ruiz", "ana@gmail.com"));
        service.registerCustomer(new Customer("C003", "Luis Gomez", "luis@gmail.com"));

        System.out.println("=====================CLIENTES====================");
        service.showAllCustomers();
        
        System.out.println("===============BUSCAR CLIENTE==================");
        System.out.println(service.findCustomer("C002"));
        
        System.out.println("===============ACTUALIZAR EMAIL========================");
        service.updateEmail("C002", "ana002@gmail.com");

        System.out.println("===============BUSCAR CLIENTE==================");
        System.out.println(service.findCustomer("C002"));

        System.out.println("====================EXISTE C004?=====================");
        System.out.println(service.existsCustomer("C004"));
        
        System.out.println("==============ELIMINAR CLIENTE======================");
        System.out.println(service.removeCustomer("C002"));
        
        System.out.println("=====================CLIENTES====================");
        service.showAllCustomers();

        System.out.println("=================TOTAL CLIENTES===============");
        System.out.println(service.totalCustomers());
    }
}
