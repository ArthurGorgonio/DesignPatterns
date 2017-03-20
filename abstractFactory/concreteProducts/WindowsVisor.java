package concreteProducts;

import abstractProducts.VisorFactory;

//Product C2
public class WindowsVisor implements VisorFactory {

    @Override
    public void showVisor() {
        System.out.println("Draw a visor in a Windows screen!");

    }

}
