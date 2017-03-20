package concreteProducts;

import abstractProducts.ButtomFactory;

//Product A2
public class UbuntuButton implements ButtomFactory {

    @Override
    public void showButton() {
        System.out.println("Draw a buttom in a Ubuntu screen!");

    }

}
