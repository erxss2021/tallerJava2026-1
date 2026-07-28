import java.time.LocalDateTime;

import models.SupportTicket;
import services.TicketService;

public class App {
    public static void main(String[] args){
        TicketService service = new TicketService();

        service.registerTicket(
            new SupportTicket(1L, "Carlos", "No inicia sesión", LocalDateTime.now()));
        service.registerTicket(
            new SupportTicket(2L, "Ana", "Error al pagar", LocalDateTime.now()));
        service.registerTicket(
            new SupportTicket(3L, "Luis", "No se genera la factura", LocalDateTime.now()));
        
        service.showAllTickets();

        System.out.println("=================PENDIENTES===================");
        System.out.println(service.pendingTickets());
        
        System.out.println("==============SIGUIENTE TICKET================");
        System.out.println(service.nextTicket());
        
        System.out.println("=================PENDIENTES===================");
        System.out.println(service.pendingTickets());

        System.out.println("===============ATENDER UNO TICKET====================");
        System.out.println(service.attendTicket());
        
        System.out.println("=================PENDIENTES===================");
        System.out.println(service.pendingTickets());
        
        System.out.println("==================PROCESAR TODOS==================");
        service.processAllTickets();

        System.out.println("=================PENDIENTES===================");
        System.out.println(service.pendingTickets());

        service.showAllTickets();



    }
        
    
}
