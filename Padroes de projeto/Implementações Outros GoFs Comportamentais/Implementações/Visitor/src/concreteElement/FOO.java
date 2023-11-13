package concreteElement;

import visitor.Visitor;
import element.Element;

public class FOO implements Element{
	
	 public void accept(Visitor visitor) {
	        visitor.visit(this);
	    }

	    public String getFOO() {
	        return "FOO";
	    }

}
