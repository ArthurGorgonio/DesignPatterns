package builders;

import builder.TicketBuilder;

/* Tickets to the Caixa bank
 * Sets the values when a Ticket from Caixa are builded
 */

public class CaixaTicketBuilder extends TicketBuilder {

    @Override
    public void buildNumber() {
        tickets.number = 1;

    }

    @Override
    public void buildName() {
        tickets.name = "Fulano";

    }

    @Override
    public void buildAge() {
        tickets.age = 18;

    }

    @Override
    public void buildValue() {
        tickets.value = 147.78;

    }

    @Override
    public void buildBank() {
        tickets.bank = "Caixa";

    }

}
