package Client;

import java.util.ArrayList;
import java.util.List;
import prototype.Prototype;

public class PrototypeModule {
	
	// arrayList
    private static List<Prototype> prototypes = new ArrayList<>();

    // add features
    public static void addPrototype(Prototype p) {
        prototypes.add(p);
    }

    public static Prototype createPrototype(String name) {
    	Prototype p = null;
        for (Prototype prototype : prototypes) {
            if (prototype.getName()!= null) {
            	System.out.println("CLONING");
                p = prototype.clone();
                System.out.println("EXECUTING");
                prototype.execute();
            }
            else{
            	System.out.println(name + ": doesn't exist");
                p = null;
            }
        }
        return p;   
    }  
    
    public static List<Prototype> getPrototypeArrayList(){
    	return prototypes;
    }
}
