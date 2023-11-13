package concretePrototypes;

import prototype.Prototype;

public class ReleasePrototype implements Prototype{
	
	private String name = "ReleaseCandidate";
    @Override
    public Prototype clone() {
    	System.out.println("clone in ReleasePrototype");
        return new ReleasePrototype();
    }

    @Override
    public String getName() {
    	System.out.println("getName in ReleasePrototype");
        return name;
    }

    @Override
    public void execute() {
    	System.out.println("execute in ReleasePrototype");
        System.out.println(name + ": does real work");
    }

}
