package concreteProducts;

import abstractProducts.ButtomFactory;

//Product C1
public class WindowsButton implements ButtomFactory{

    @Override
    public void showButton() {
        System.out.println("Draw a buttom in a Windows screen!");
        
    }

}
