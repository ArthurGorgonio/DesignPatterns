package builder;

import product.Ticket;

/* Builder class
 * The Builder of this class create a new Ticket
 * Abstracts methods to set the common attributes in the tickets
 * Return the object builded 
 */
public abstract class TicketBuilder {
    protected Ticket tickets;

    public TicketBuilder() {
        tickets = new Ticket();
    }

    public abstract void buildNumber();

    public abstract void buildName();

    public abstract void buildAge();

    public abstract void buildValue();

    public abstract void buildBank();

    public Ticket getTicket() {
        return tickets;
    }
}