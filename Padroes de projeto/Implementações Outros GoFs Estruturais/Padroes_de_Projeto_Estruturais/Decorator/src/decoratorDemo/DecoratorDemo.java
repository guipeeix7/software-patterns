package decoratorDemo;

import component.Widget;

import concreteComponent.TextField;
import concreteDecorator.BorderDecorator;
import concreteDecorator.ScrollDecorator;

public class DecoratorDemo {

	/**
	 * Reference: https://sourcemaking.com/design_patterns/decorator/java/3
	 * Modified by Milene
	 */
	public static void main(String[] args) {
		TextField textField = new TextField(80, 24);
		Widget widget1 = (Widget) textField;
		Widget widget2 = new ScrollDecorator(widget1);
		Widget widget3 = new BorderDecorator(widget2);
		Widget widget4 = new BorderDecorator(widget3);
		
		widget4.drawWidget();
	}

}
