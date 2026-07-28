package services;

import java.util.LinkedList;
import java.util.Queue;

import models.SupportTicket;

public class TicketService {
    private final Queue<SupportTicket> tickets;

    public TicketService() {
        tickets = new LinkedList<>();
    }

    public boolean registerTicket(SupportTicket ticket){
        return tickets.offer(ticket);               
    }

    public SupportTicket nextTicket(){
        return tickets.peek();
    }

    //ticket2 -> ticket3

    public SupportTicket attendTicket(){
        return tickets.poll();
    }
    
    public int pendingTickets(){
        return tickets.size();
    }

    public void processAllTickets(){
        while (!tickets.isEmpty()) {
            SupportTicket ticket = tickets.poll();
            System.out.println("Atendiendo -> " + ticket);
        }
    }

    public void showAllTickets(){
        tickets.forEach(t -> System.out.println(t));
    }

}
