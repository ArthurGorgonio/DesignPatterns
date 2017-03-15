package abstractFactory.products;

import abstractFactory.abstractPrinter.Printer;

public class ConsoleProduct implements Printer {

    @Override
    public void showMensage() {
        System.out.println("Show hello Word in an Console!");
    }

}
