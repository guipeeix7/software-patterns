package demoChainOfResponsibility;

import request.PurchaseRequest;
import handler1.ManagerPPower;
import handler2.DirectorPPower;
import handler3.VicePresidentPPower;
import handler4.PresidentPPower;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class CheckAuthority {

	/**
	 * Reference: https://pt.wikipedia.org/wiki/Chain_of_Responsibility
	 * Modified by Milene.
	 */
	public static void main(String[] args) {
		ManagerPPower manager = new ManagerPPower();
		DirectorPPower director = new DirectorPPower();
		VicePresidentPPower vicePresident = new VicePresidentPPower();
		PresidentPPower president = new PresidentPPower();
		
		manager.setSuccessor(director);
		director.setSuccessor(vicePresident);
		vicePresident.setSuccessor(president);
		
		try {
			while(true) {
				System.out.println("Enter the amount to check who should approve your expenditure.");
				System.out.print(">");
			
				double valor = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
				manager.processRequest(new PurchaseRequest(valor, "General"));
			}
		} catch (Exception e){
			System.exit(1);
		}
	}

}
