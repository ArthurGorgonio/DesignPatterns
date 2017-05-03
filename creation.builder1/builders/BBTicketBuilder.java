package builders;

import builder.TicketBuilder;

/* Tickets to the BB bank
 * Sets the values when a Ticket from BB are builded
 */

public class BBTicketBuilder extends TicketBuilder {

    @Override
    public void buildNumber() {
        tickets.number = 81;

    }

    @Override
    public void buildName() {
        tickets.name = "Sicrano";

    }

    @Override
    public void buildAge() {
        tickets.age = 22;

    }

    @Override
    public void buildValue() {
        tickets.value = 90.6;

    }

    @Override
    public void buildBank() {
        tickets.bank = "BB";

    }

}
