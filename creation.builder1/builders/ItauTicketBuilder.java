package builders;

import builder.TicketBuilder;

/* Tickets to the Itaú bank
 * Sets the values when a Ticket from Itaú are builded
 */

public class ItauTicketBuilder extends TicketBuilder {

    @Override
    public void buildNumber() {
        tickets.number = 21;

    }

    @Override
    public void buildName() {
        tickets.name = "Beltrano";

    }

    @Override
    public void buildAge() {
        tickets.age = 53;

    }

    @Override
    public void buildValue() {
        tickets.value = 54.3;

    }

    @Override
    public void buildBank() {
        tickets.bank = "Itaú";

    }

}
