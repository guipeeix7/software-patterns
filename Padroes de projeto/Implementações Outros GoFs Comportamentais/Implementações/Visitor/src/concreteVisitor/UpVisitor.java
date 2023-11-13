package concreteVisitor;

import concreteElement.BAR;
import concreteElement.BAZ;
import concreteElement.FOO;
import visitor.Visitor;

public class UpVisitor implements Visitor{
	
	public void visit(FOO foo) {
        System.out.println("do Up on " + foo.getFOO());
    }

    public void visit(BAR bar) {
        System.out.println("do Up on " + bar.getBAR());
    }

    public void visit(BAZ baz) {
        System.out.println( "do Up on " + baz.getBAZ());
    }

}
