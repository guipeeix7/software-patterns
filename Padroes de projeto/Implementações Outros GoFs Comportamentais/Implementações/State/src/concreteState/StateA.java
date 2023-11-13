package concreteState;

import state.State;

public class StateA extends State{
	
	public void on() {
		System.out.println("A + on = C");
	}
	
	public void off() {
		System.out.println("A + off = B");
	}
	
	public void ack() {
		System.out.println("A + ack = A");
	}

}
