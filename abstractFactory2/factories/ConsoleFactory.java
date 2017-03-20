package factories;

import abstractPrinter.Printer;
import helloWorld.HelloWorld;
import products.ConsoleProduct;

public class ConsoleFactory implements HelloWorld {

    @Override
    public Printer helloWorld() {
        return new ConsoleProduct();
    }

}
