package concreteFactories;

import abstractFactoryGUI.GUIFactory;
import abstractProducts.*;
import concreteProducts.MacOsXButton;
import concreteProducts.MacOsXVisor;

//Concrete Factory 1
public class MacOsXFactory implements GUIFactory {

    //Override of the Abstract Factory
    @Override
    public ButtomFactory createButton() {
        return new MacOsXButton();
    }

    @Override
    public VisorFactory createVisor() {
        return new MacOsXVisor();
    }

}
