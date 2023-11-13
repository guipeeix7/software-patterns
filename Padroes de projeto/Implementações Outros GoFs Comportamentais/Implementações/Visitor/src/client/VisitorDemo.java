package client;

import visitor.Visitor;
import element.Element;
import concreteElement.BAR;
import concreteElement.BAZ;
import concreteElement.FOO;
import concreteVisitor.DownVisitor;
import concreteVisitor.UpVisitor;

public class VisitorDemo {

	/**
	 * Reference: https://sourcemaking.com/design_patterns/visitor/java/1 
	 * Modified by Milene.
	 */
	public static void main(String[] args) {
		
		// A entidade ObjectStructure - típica da modelagem de um Visitor - está representada na própria main, nesse exemplo.
		//Portanto, trata-se de uma adaptação, não sendo uma implementação purista. Ok?
		Element[] list = {new FOO(), new BAR(), new BAZ()};
		
		Visitor visitor = new UpVisitor();

		for (Element element : list) {
            element.accept(visitor);
        }
		
		visitor = new DownVisitor();
      
        for (Element element : list) {
            element.accept(visitor);
        }

	}

}
