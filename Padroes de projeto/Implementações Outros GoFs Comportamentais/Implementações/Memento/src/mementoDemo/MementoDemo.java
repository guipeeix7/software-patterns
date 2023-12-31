package mementoDemo;

import originator.Originator;
import caretaker.Caretaker;

public class MementoDemo {

	/**
	 * Reference:
	 * Modified by Milene.
	 */
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();
		
		originator.setState("State1");
		originator.setState("State2");
		
		caretaker.addMemento( originator.save() );
		
		originator.setState("State3");
		caretaker.addMemento( originator.save() );
		
		originator.setState("State4");
		originator.restore( caretaker.getMemento() );
	}

}
