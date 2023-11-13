package state;

public abstract class State {
	
	public abstract void on();
	
	public void off(){
		System.out.println("error");
	}
	
	public void ack(){
		System.out.println("error");
	}
	
}
