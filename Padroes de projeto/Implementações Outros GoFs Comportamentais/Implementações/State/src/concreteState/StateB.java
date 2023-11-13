package concreteState;

import state.State;

public class StateB extends State{
	
	public void on() {
		System.out.println("B + on = A");
	}
	
	public void off() {
		System.out.println("B + off = C");
	}

}
