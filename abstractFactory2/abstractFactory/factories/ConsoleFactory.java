package abstractFactory.factories;

import abstractFactory.abstractPrinter.Printer;
import abstractFactory.helloWord.HelloWord;
import abstractFactory.products.ConsoleProduct;

public class ConsoleFactory implements HelloWord {

    @Override
    public Printer helloWord() {
        return new ConsoleProduct();
    }

}
