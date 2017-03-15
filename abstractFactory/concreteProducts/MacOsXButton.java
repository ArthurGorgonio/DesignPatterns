package concreteProducts;

import abstractProducts.ButtomFactory;

//Product A1
public class MacOsXButton implements ButtomFactory {

    @Override
    public void showButton() {
         System.out.println("Draw a buttom in a Mac OS X screen!");
    }

}
