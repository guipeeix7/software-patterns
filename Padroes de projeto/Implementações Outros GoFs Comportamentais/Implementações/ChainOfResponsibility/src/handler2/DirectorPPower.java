package handler2;

import handler.PurchasePower;

public class DirectorPPower extends PurchasePower{
	
	protected double getAllowable(){
		return BASE * 2;
	}
	
	protected String getRole(){
		return "Director";
	}
}
