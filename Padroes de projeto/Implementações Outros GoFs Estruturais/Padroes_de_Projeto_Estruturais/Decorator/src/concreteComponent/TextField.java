package concreteComponent;

import component.Widget;

public class TextField implements Widget{
	
	private int width, height;

    public TextField(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void drawWidget() {
        System.out.println("TextField: " + width + ", " + height);
    }

}
