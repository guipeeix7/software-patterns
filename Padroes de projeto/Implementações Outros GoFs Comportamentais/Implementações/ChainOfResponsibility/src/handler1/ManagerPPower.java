package handler1;

import handler.PurchasePower;

public class ManagerPPower extends PurchasePower {
	
	protected double getAllowable(){
		return BASE * 1;
	}
	
	protected String getRole(){
		return "Manager";
	}
}
