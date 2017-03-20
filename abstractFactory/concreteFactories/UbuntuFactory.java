package concreteFactories;

import abstractFactoryGUI.GUIFactory;
import abstractProducts.*;
import concreteProducts.UbuntuButton;
import concreteProducts.UbuntuVisor;

//Concrete Factory 2
public class UbuntuFactory implements GUIFactory {

    //Override of the Abstract Factory
    @Override
    public ButtomFactory createButton() {
        return new UbuntuButton();
    }

    @Override
    public VisorFactory createVisor() {
        // TODO Auto-generated method stub 
        return new UbuntuVisor();
    }

}
