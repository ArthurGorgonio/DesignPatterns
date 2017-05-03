package decorator;

import component.WindowsComponent;

public abstract class WindowsDecorator extends WindowsComponent {
    protected WindowsComponent beatifulWindows;
    
    public WindowsDecorator(WindowsComponent beatifulWindows){
        this.beatifulWindows = beatifulWindows;
    }
}
