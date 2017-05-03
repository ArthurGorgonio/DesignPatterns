package decorator;

import component.ButtonComponent;

public abstract class ButtonDecorator extends ButtonComponent{
    protected ButtonComponent beatifulButton;
    
    public ButtonDecorator(ButtonComponent beatifulButton){
        this.beatifulButton = beatifulButton;
    }
}
