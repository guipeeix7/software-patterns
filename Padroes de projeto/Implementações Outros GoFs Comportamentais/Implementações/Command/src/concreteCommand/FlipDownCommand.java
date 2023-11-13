package concreteCommand;

import receiver.Light;
import command.Command;

public class FlipDownCommand implements Command{
	
	private Light theLight;
	
	public FlipDownCommand(Light light) {
		this.theLight = light;
	}
	
	@Override // Command
	public void execute() {
		theLight.turnOff();
	}

}
