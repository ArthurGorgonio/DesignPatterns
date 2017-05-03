package structural.clients;

import component.ButtonComponent;
import component.WindowsComponent;
import concretDecorator.CancelButtonDecorator;
import concretDecorator.ConfirmButtonDecorator;
import concretDecorator.HorizontalScrolBarDecorator;
import concretDecorator.VerticalScrolBarDecorator;
import concreteComponent.SimpleButtonComponent;
import concreteComponent.SimpleWindowsConcret;

public class DecoratorClient1 {

    public static void main(String[] args) {
        System.out.println("JFrame sem nenhum componente\n");
        
        WindowsComponent beautifulWindows = new VerticalScrolBarDecorator(new SimpleWindowsConcret());
        beautifulWindows.draw();
        
        beautifulWindows = new HorizontalScrolBarDecorator(new SimpleWindowsConcret());
        beautifulWindows.draw();
        
        System.out.println("\nJFrame sem botões\n");
        
        ButtonComponent beautifulButton = new ConfirmButtonDecorator(new SimpleButtonComponent());
        beautifulButton.showButton();
        
        beautifulButton = new CancelButtonDecorator(new SimpleButtonComponent());
        beautifulButton.showButton();
    }

}
