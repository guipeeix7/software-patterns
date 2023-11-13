package demo;

import complementary.Connection;

import concreteObjectPool.JDBCConnectionPool;

public class ObjectPoolDemo {

	/**
	 * Reference: https://sourcemaking.com/design_patterns/object_pool/java 
	 * Modified by Milene
	 */
	public static void main(String[] args) {
		// Do something...
	
	    // Create the ConnectionPool:
	    JDBCConnectionPool pool = new JDBCConnectionPool("org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb", "sa", "secret");

	    // Get a connection:
	    Connection connection = pool.checkOut();

	    // Use the connection

	    // Return the connection:
	    pool.checkIn();
	 
	  }
}
