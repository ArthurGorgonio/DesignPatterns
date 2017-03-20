package clients;

import abstractFactoryGUI.GUIFactory;
import abstractProducts.*;
import concreteFactories.*;

public class AbstractFactoryClient1 {

    public static void main(String[] args) {
        //Windows Factory encapsulate create Button and Visor
        GUIFactory guiFactory = new WindowsFactory();
        
        //Creating Windows's button and visor
        ButtomFactory button = guiFactory.createButton();
        VisorFactory visor = guiFactory.createVisor();
        
        //Show Windows's button and visor
        button.showButton();
        System.out.println();
        visor.showVisor();
        System.out.println();

        //Mac OS X Factory encapsulate create Button and Visor
        guiFactory = new MacOsXFactory();
        
        //Creating Mac OS X's button and visor
        button = guiFactory.createButton();
        visor = guiFactory.createVisor();
        
        //Show Mac OS X's button and visor
        button.showButton();
        System.out.println();
        visor.showVisor();
        System.out.println();

        //Ubuntu Factory encapsulate create Button and Visor
        guiFactory = new UbuntuFactory();
        
        //Creating Ubuntu's button and visor
        button = guiFactory.createButton();
        visor = guiFactory.createVisor();
        
        //Show Ubuntu's button and visor
        button.showButton();
        System.out.println();
        visor.showVisor();
        System.out.println();
    }
}