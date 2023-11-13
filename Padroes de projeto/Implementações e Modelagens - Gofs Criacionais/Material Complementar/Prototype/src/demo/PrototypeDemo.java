package demo;

import concretePrototypes.PrototypeAlpha;
import concretePrototypes.PrototypeBeta;
import concretePrototypes.ReleasePrototype;
import Client.PrototypeModule;

public class PrototypeDemo {

	/**
	 * Reference: https://sourcemaking.com/design_patterns/prototype/java/2
	 * Modified by Milene
	 */
	public static void main(String[] args) {
		
			PrototypeAlpha prototypeAlpha = new PrototypeAlpha();
			PrototypeModule.addPrototype(prototypeAlpha);
			System.out.println(prototypeAlpha.getName());
			
			PrototypeBeta prototypeBeta = new PrototypeBeta();
			PrototypeModule.addPrototype(prototypeBeta);
			System.out.println(prototypeBeta.getName());
			
	        ReleasePrototype prototypeRelease = new ReleasePrototype();
			PrototypeModule.addPrototype(prototypeRelease);
			System.out.println(prototypeRelease.getName());
			
	        System.out.println("adds finalized");
	              
			PrototypeModule.createPrototype("Prototype");
			System.out.println(PrototypeModule.getPrototypeArrayList());
			System.out.println(PrototypeModule.getPrototypeArrayList().get(0).getName());
			System.out.println(PrototypeModule.getPrototypeArrayList().get(1).getName());
			System.out.println(PrototypeModule.getPrototypeArrayList().get(2).getName());
			System.out.println("TheEnd");
	 }
}
