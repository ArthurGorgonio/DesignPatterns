package concreteProducts;

import abstractProducts.VisorFactory;

//Product B1
public class MacOsXVisor implements VisorFactory {

    @Override
    public void showVisor() {
        System.out.println("Draw a visor in a Mac OS X screen!");

    }

}
