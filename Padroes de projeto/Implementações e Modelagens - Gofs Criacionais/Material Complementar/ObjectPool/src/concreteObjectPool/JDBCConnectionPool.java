package concreteObjectPool;

import complementary.Connection;

import java.util.List;

import objectPool.ObjectPool;

public class JDBCConnectionPool extends ObjectPool<Connection> {
	
	private String driver, dsn, usr, pwd;

	  public JDBCConnectionPool(String driver, String dsn, String usr, String pwd) {
	    super();
	    this.driver = driver;
	    this.dsn = dsn;
	    this.usr = usr;
	    this.pwd = pwd;
	  }

	  @Override
	  protected List<Connection> adquire() {
	   System.out.println("simulation that the connection is created");
	   return connections;
	  }

	  @Override
	  public boolean release(List<Connection> connections) {
		  System.out.println("simulation that the connection is released");
		   return true;
	  }
}
