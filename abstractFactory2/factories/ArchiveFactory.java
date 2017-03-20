package factories;

import abstractPrinter.Printer;
import helloWorld.HelloWorld;
import products.ArchiveProduct;

public class ArchiveFactory implements HelloWorld {

    @Override
    public Printer helloWorld() {
        return new ArchiveProduct();
    }

}
