package concreteCommand;

import receiver.Light;
import command.Command;

public class FlipUpCommand implements Command{
	
	private Light theLight;
	
	public FlipUpCommand(Light light) {
		this.theLight = light;
	}
	
	@Override // Command
	public void execute() {
		theLight.turnOn();
	}

}
