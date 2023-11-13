package handler4;

import handler.PurchasePower;

public class PresidentPPower extends PurchasePower{
	
	protected double getAllowable(){
		return BASE * 4;
	}
	 
	protected String getRole(){
		return "President";
	}

}
