package abstractFactoryGUI;

//Importing all abstracts products
import abstractProducts.*;

//Abstract Factory
public interface GUIFactory {
    ButtomFactory createButton();
    VisorFactory createVisor();
}
