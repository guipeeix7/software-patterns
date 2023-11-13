package handler3;

import handler.PurchasePower;

public class VicePresidentPPower extends PurchasePower{
	
	protected double getAllowable(){
		return BASE * 3;
	}
	
	protected String getRole(){
		return "Vice President";
	}

}
