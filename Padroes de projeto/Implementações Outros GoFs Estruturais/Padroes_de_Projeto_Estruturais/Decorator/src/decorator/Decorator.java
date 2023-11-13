package decorator;

import java.util.ArrayList;
import java.util.List;

import component.Widget;

public class Decorator implements Widget{
	
private List <Widget> widgets = new ArrayList <Widget>();

	public Decorator(Widget widget){
		this.addWidget(widget);
	}
	
	public void addWidget(Widget widget){
		this.widgets.add(widget);
	}
	
	public void removeWidget(Widget widget){
		this.widgets.remove(widget);
	}
	
	public void drawWidget(){
		for(Widget widget : this.widgets){
			widget.drawWidget();
		}
	}

}
