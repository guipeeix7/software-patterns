package visitor;

import concreteElement.BAR;
import concreteElement.BAZ;
import concreteElement.FOO;

public interface Visitor {
	
	public void visit(FOO foo);
    public void visit(BAR bar);
    public void visit(BAZ baz);

}
