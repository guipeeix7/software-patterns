package concreteElement;

import visitor.Visitor;
import element.Element;

public class BAR implements Element{
	
	public void   accept( Visitor visitor ) {
        visitor.visit( this );
    }

    public String getBAR() {
        return "BAR";
    }

}
