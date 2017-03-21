package clients;

import builders.BBTicketBuilder;
import builders.CaixaTicketBuilder;
import builders.ItauTicketBuilder;
import director.TicketManager;
import product.Ticket;

public class BuilderClient1 {
    public static void main(String[] args){
        TicketManager tkManager = new TicketManager(new CaixaTicketBuilder());
        
        tkManager.BuildTicket();
        
        Ticket ticket = tkManager.getTicket();
        System.out.println("Número: " + ticket.number
                + "\nBanco: " + ticket.bank
                + "\nValor: " + ticket.value
                + "\nTitular: " + ticket.name
                + "\nIdade: " + ticket.age);
        
        System.out.println();
        
        tkManager = new TicketManager(new BBTicketBuilder());
        
        tkManager.BuildTicket();
        
        ticket = tkManager.getTicket();
        System.out.println("Número: " + ticket.number
                + "\nBanco: " + ticket.bank
                + "\nValor: " + ticket.value
                + "\nTitular: " + ticket.name
                + "\nIdade: " + ticket.age);
        
        System.out.println();
        
        tkManager = new TicketManager(new ItauTicketBuilder());
        
        tkManager.BuildTicket();
        
        ticket = tkManager.getTicket();
        System.out.println("Número: " + ticket.number
                + "\nBanco: " + ticket.bank
                + "\nValor: " + ticket.value
                + "\nTitular: " + ticket.name
                + "\nIdade: " + ticket.age);
        
        System.out.println();
    }
}
