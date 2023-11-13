package concreteElement;

import visitor.Visitor;
import element.Element;

public class BAZ implements Element{
	
	public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getBAZ() {
        return "BAZ";
    }

}
