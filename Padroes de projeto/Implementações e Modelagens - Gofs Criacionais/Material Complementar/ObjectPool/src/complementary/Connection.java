package complementary;

public class Connection {
	
	boolean isCreated;
	boolean isConnected;
	
	public Connection(){
		this.isCreated = true;
		this.isConnected = true;
	}

	public boolean isCreated() {
		return isCreated;
	}

	public void setCreated(boolean isCreated) {
		this.isCreated = isCreated;
	}

	public boolean isConnected() {
		return isConnected;
	}

	public void setConnected(boolean isConnected) {
		this.isConnected = isConnected;
	}
	
	

}
