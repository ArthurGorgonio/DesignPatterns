package concreteProducts;

import abstractProducts.VisorFactory;

//Product B2
public class UbuntuVisor implements VisorFactory{

    @Override
    public void showVisor() {
        System.out.println("Draw a visor in a Ubuntu screen!");
        
    }
}
