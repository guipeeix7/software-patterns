package involker;

import java.util.ArrayList;
import java.util.List;

import command.Command;

public class Switch {
	
	private List<Command> history = new ArrayList<Command>();
	
	public void storeAndExecute(Command cmd) {
		this.history.add(cmd);
		//System.out.println(this.history);
		cmd.execute();
	}
}
