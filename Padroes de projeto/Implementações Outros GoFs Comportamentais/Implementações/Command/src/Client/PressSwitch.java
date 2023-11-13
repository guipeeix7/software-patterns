package Client;

import involker.Switch;
import command.Command;
import concreteCommand.FlipDownCommand;
import concreteCommand.FlipUpCommand;
import receiver.Light;

public class PressSwitch {

	/**
	 * Reference: https://pt.wikipedia.org/wiki/Command 
	 * Modified by Milene
	 */
	public static void main(String[] args) {
		
		Light lamp = new Light();
		Command switchUp = new FlipUpCommand(lamp);
		Command switchDown = new FlipDownCommand(lamp);
		Switch mySwitch = new Switch();
		
		String press = "ON";
		
		for(int i = 0; i <= 2; i++){
			switch(press) {
				case "ON":
					mySwitch.storeAndExecute(switchUp);
					press = "OFF";
					break;
				case "OFF":
					mySwitch.storeAndExecute(switchDown);
					press = "ON";
					break;
				default:
					System.err.println("Argumento \"ON\" or \"OFF\" é necessário.");
					System.exit(-1);
			}
		}
	}

}
