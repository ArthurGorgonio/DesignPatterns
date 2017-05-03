package concreteFactories;

import abstractFactoryGUI.GUIFactory;
import abstractProducts.*;
import concreteProducts.WindowsButton;
import concreteProducts.WindowsVisor;

//Concrete Factory 3
public class WindowsFactory implements GUIFactory{
    
    // Override of the Abstract Factory
    @Override
    public ButtomFactory createButton() {
        return new WindowsButton();
    }

    @Override
    public VisorFactory createVisor() {
        return new WindowsVisor();
    }

}
