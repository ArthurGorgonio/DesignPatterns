package creation.clients;

import builders.BBTicketBuilder;
import builders.CaixaTicketBuilder;
import builders.ItauTicketBuilder;
import director.TicketManager;
import product.Ticket;

public class BuilderClient1 {
    public static void main(String[] args){
        TicketManager tkManager = new TicketManager(new CaixaTicketBuilder());
        
        tkManager.buildTicket();
        
        Ticket ticket = tkManager.getTicket();
        System.out.println("Número: " + ticket.number
                + "\nBanco: " + ticket.bank
                + "\nValor: " + ticket.value
                + "\nTitular: " + ticket.name
                + "\nIdade: " + ticket.age);
        
        System.out.println();
        
        tkManager = new TicketManager(new BBTicketBuilder());
        
        tkManager.buildTicket();
        
        ticket = tkManager.getTicket();
        System.out.println("Número: " + ticket.number
                + "\nBanco: " + ticket.bank
                + "\nValor: " + ticket.value
                + "\nTitular: " + ticket.name
                + "\nIdade: " + ticket.age);
        
        System.out.println();
        
        tkManager = new TicketManager(new ItauTicketBuilder());
        
        tkManager.buildTicket();
        
        ticket = tkManager.getTicket();
        System.out.println("Número: " + ticket.number
                + "\nBanco: " + ticket.bank
                + "\nValor: " + ticket.value
                + "\nTitular: " + ticket.name
                + "\nIdade: " + ticket.age);
        
        System.out.println();
    }
}
