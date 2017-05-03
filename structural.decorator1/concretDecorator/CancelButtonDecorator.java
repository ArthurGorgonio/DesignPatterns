package concretDecorator;

import component.ButtonComponent;
import decorator.ButtonDecorator;

public class CancelButtonDecorator extends ButtonDecorator{

    public CancelButtonDecorator(ButtonComponent beatifulButton) {
        super(beatifulButton);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void showButton() {
        beatifulButton.showButton();
        drawCancelButton();
     }
     
     private void drawCancelButton(){
         System.out.println("Desenha o botão de cancelar na janela");
     }
}
