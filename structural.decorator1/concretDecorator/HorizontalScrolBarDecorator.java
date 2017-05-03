package concretDecorator;

import component.WindowsComponent;
import decorator.WindowsDecorator;

public class HorizontalScrolBarDecorator extends WindowsDecorator{
    
    public HorizontalScrolBarDecorator(WindowsComponent beatifulWindows) {
        super(beatifulWindows);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void draw() {
       beatifulWindows.draw();
       drawHorizontalScrolBar();
    }
    
    private void drawHorizontalScrolBar(){
        System.out.println("Desenha uma barra horizontal na janela");
    }
}
