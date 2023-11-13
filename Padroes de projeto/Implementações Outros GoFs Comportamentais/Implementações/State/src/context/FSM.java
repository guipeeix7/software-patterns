package context;

import concreteState.StateA;
import concreteState.StateB;
import concreteState.StateC;
import state.State;

public class FSM {
	
	//States
	private State[] states = {new StateA(), new StateB(), new StateC()};
	
	//Transitions
	private int[][] transition = {{2,1,0}, {0,2,1}, {1,2,2}};
	
	//Current
	private int current = 0;
	private void next(int msg) {
		current = transition[current][msg];
	}
	
	// All client requests are simply delegated to the current state object
	public void on() {
		states[current].on();
		next(0);
	}
	
	public void off() {
		states[current].off();
		next(1);
	}
	
	public void ack() {
		states[current].ack();
		next(2);
	}

}
