package test;

import models.Ticket;
import services.TicketManager;

public class Main {
    public static void main(String[] args) {
        TicketManager manager = new TicketManager();
        System.out.println("=============AGREGAR AL FINAL==================");
        Ticket ticket = new Ticket(1L, "Error en el Login", "HIGH");
        manager.addLastTicket(ticket);
        manager.addLastTicket(new Ticket(2L, "Error de pagos", "CRITICAL"));
        manager.addLastTicket(new Ticket(3L, "Problema de conexion", "MEDIUM"));
        System.out.println("=============RECORRIDO HACIA ADELANTE==============");
        manager.printForwardTickets();
        System.out.println("=============RECORRIDO HACIA ATRAS==============");
        manager.printBackwardTickets();
        
        System.out.println("=========AGREGAR AL INICIO=====================");
        manager.addFirstTicket(new Ticket(4L, "Servidor no disponible", "CRITICAL"));
        manager.addFirstTicket(new Ticket(4L, "Servidor no disponible", "CRITICAL"));
        manager.printForwardTickets();

        System.out.println("==========PRIMER TICKET==============");
        System.out.println(manager.getFirstTicket());
        System.out.println("==============ULTIMO TICKET=====================");
        System.out.println(manager.getLasTicket());

        System.out.println("==============INSERTAR EN UNA POSICION===================");
        manager.insertTicket(2,  new Ticket(5L, "Error de reportes", "LOW"));
        manager.insertTicket(2,  new Ticket(5L, "Error de reportes", "LOW"));
        manager.printForwardTickets();
        System.out.println("============ELIMINAR ULTIMO================");
        System.out.println("Ticket eliminado: " + manager.removeLasTicket());
        manager.printForwardTickets();
        System.out.println("============ELIMINAR PRIMERO================");
        System.out.println("Ticket eliminado: " + manager.removeFirsTicket());
        manager.printForwardTickets();


    }

}
