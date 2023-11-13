package concretePrototypes;

import prototype.Prototype;

public class PrototypeAlpha implements Prototype{
	
	private String name = "AlphaVersion";

    @Override
    public Prototype clone() {
    	System.out.println("clone in PrototypeAlpha");
        return new PrototypeAlpha();
    }

    @Override
    public String getName() {
    	System.out.println("getName in PrototypeAlpha");
        return name;
    }

    @Override
    public void execute() {
    	System.out.println("execute in PrototypeAlpha");
        System.out.println(name + ": does something");
    }

}
