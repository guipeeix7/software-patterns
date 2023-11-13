package multiton;

import java.util.HashMap;
import java.util.Map;

public final class Multiton {
	private static final Map<Object, Multiton> instances = new HashMap<Object, Multiton>();
	 
	private Multiton() { }
	 
	public static Multiton getMultiton(Object key)
	{
	  Multiton instance = instances.get(key);
	  
	  if(instance == null){
		  synchronized (Multiton.class){
			  if(instance == null){
				  instance = new Multiton();
			  }
		  }
	  }
	  return instance;
	}
	
	public void otherOperation(){
		System.out.println("Multiton Other Operation...");
	}
}

