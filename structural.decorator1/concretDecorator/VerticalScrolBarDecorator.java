package concretDecorator;

import component.WindowsComponent;
import decorator.WindowsDecorator;

public class VerticalScrolBarDecorator extends WindowsDecorator {

    public VerticalScrolBarDecorator(WindowsComponent beatifulWindows) {
        super(beatifulWindows);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void draw() {
       beatifulWindows.draw();
       drawVerticalScrolBar();
    }
    
    private void drawVerticalScrolBar(){
        System.out.println("Desenha uma barra vertical na janela");
    }
    
}
