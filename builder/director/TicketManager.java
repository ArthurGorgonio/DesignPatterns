package director;

import builder.TicketBuilder;
import product.Ticket;

/* 
 * The builder of this class receives a Ticket and pass this Ticket for the Ticket created in this class
 * Building the Ticket
 * Returning for the Client the Ticket builded
 */
public class TicketManager {
    protected TicketBuilder ticket;

    public TicketManager(TicketBuilder tkBuilder) {
        ticket = tkBuilder;
    }

    public void BuildTicket() {
        ticket.buildNumber();

        ticket.buildName();

        ticket.buildAge();

        ticket.buildValue();

        ticket.buildBank();
    }

    public Ticket getTicket() {
        return ticket.getTicket();
    }
}
