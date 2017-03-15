package abstractFactory.factories;

import abstractFactory.abstractPrinter.Printer;
import abstractFactory.helloWord.HelloWord;
import abstractFactory.products.ArchiveProduct;

public class ArchiveFactory implements HelloWord {

    @Override
    public Printer helloWord() {
        return new ArchiveProduct();
    }

}
