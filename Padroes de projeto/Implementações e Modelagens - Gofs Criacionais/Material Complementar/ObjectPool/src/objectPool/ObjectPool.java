package objectPool;

import java.util.ArrayList;
import java.util.List;

import complementary.Connection;

public abstract class ObjectPool<T> {
	
	private long expirationTime;
	protected List <Connection> connections;
	
    public ObjectPool() {
	    expirationTime = 30000; // 30 seconds
	    connections = new ArrayList <Connection>();
	    connections.add(new Connection());
	    System.out.println(this.connections.get(0).isConnected());
	    connections.add(new Connection());
	    System.out.println(this.connections.get(1).isConnected());
	}

	  protected abstract List<Connection> adquire();

	  public abstract boolean release(List <Connection> connections);

	  public synchronized Connection checkOut() {
	   System.out.println("checkOut realized with get(), put() and expirationTime!");
	   Connection connection = this.connections.get(0);
	   System.out.println(this.connections.get(0));
	   return (connection);
	  }

	  public synchronized void checkIn() {
		   System.out.println("checkIn realized with put()!");
	  }

}
