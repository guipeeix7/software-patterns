package client;

import context.FSM;

public class StateDemo {

	/**
	 * Reference: https://sourcemaking.com/design_patterns/state/java/5
	 * Modified by: Milene.
	 */
	public static void main(String[] args) {
		
		FSM fsm = new FSM();
		int[] msgs = {2, 1, 2, 1, 0, 2, 0, 0};
		
		for (int msg : msgs) {
			if (msg == 0) {
				fsm.on();
			} else if (msg == 1) {
				fsm.off();
			} else if (msg == 2) {
				fsm.ack();
			}
		}
	}
}

