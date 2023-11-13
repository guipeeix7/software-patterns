package concretePrototypes;

import prototype.Prototype;

public class PrototypeBeta implements Prototype{
	
	private String name = "BetaVersion";

    @Override
    public Prototype clone() {
    	System.out.println("clone in PrototypeBeta");
        return new PrototypeBeta();
    }

    @Override
    public String getName() {
    	System.out.println("getName in PrototypeBeta");
        return name;
    }

    @Override
    public void execute() {
    	System.out.println("execute in PrototypeBeta");
        System.out.println(name + ": does something");
    }

}
