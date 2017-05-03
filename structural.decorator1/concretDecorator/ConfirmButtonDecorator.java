package concretDecorator;

import component.ButtonComponent;
import decorator.ButtonDecorator;

public class ConfirmButtonDecorator extends ButtonDecorator{

    public ConfirmButtonDecorator(ButtonComponent beatifulButton) {
        super(beatifulButton);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void showButton() {
        beatifulButton.showButton();
        drawConfirmButton();
     }
     
     private void drawConfirmButton(){
         System.out.println("Desenha o botão de confirmar na janela");
     }
}
