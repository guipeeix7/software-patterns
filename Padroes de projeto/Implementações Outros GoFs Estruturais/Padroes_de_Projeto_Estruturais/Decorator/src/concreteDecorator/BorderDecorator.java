package concreteDecorator;

import component.Widget;
import decorator.Decorator;

public class BorderDecorator extends Decorator{
	
	public BorderDecorator(Widget widget) {
        super(widget);
    }
    public void drawWidget() {
        super.drawWidget();
        System.out.println("ConcreteComponent decorado com: BorderDecorator");
    }

}
