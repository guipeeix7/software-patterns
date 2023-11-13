package concreteDecorator;

import component.Widget;
import decorator.Decorator;

public class ScrollDecorator extends Decorator{
	
	public ScrollDecorator(Widget widget) {
        super(widget);
    }
    public void drawWidget() {
        super.drawWidget();
        System.out.println("ConcreteComponent decorado com: ScrollDecorator");
    }

}
