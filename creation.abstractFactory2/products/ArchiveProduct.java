package products;

import abstractPrinter.Printer;

public class ArchiveProduct implements Printer {

    @Override
    public void showMensage() {
        System.out.println("Show hello Word in an Archive!");
    }

}
