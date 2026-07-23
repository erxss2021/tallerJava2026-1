package services;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import models.Ticket;

public class TicketManager {

    private final List<Ticket> tickets;

    public TicketManager() {
        tickets = new LinkedList<>();
    }

    public void addFirstTicket(Ticket ticket){
        tickets.addFirst(ticket);
    }

    public void addLastTicket(Ticket ticket){
        tickets.addLast(ticket);
    }

    public Ticket getFirstTicket(){
        return tickets.getFirst();
    }

    public Ticket getLasTicket(){
        return tickets.getLast();
    }

    public Ticket removeFirsTicket(){
        return tickets.removeFirst();
    }

    public Ticket removeLasTicket(){
        return tickets.removeLast();
    }

    public void insertTicket(int index, Ticket ticket){
        tickets.add(index, ticket);
    }

    public void printForwardTickets(){
        ListIterator<Ticket> iterator = tickets.listIterator();
        while (iterator.hasNext()) {
            Ticket ticket = iterator.next();
            System.out.println(ticket);
        }
    }

    public void printBackwardTickets(){
        ListIterator<Ticket> iterator = tickets.listIterator(tickets.size());
        while (iterator.hasPrevious()) {
            Ticket ticket = iterator.previous();  
            System.out.println(ticket);          
        }
    }
}
