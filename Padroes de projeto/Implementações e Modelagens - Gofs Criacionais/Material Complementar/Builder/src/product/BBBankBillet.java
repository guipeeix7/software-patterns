package product;

import java.util.Calendar;
import java.util.Locale;

public class BBBankBillet implements BankBillet {
	
	private String payer;
    private int ourBBNumber;
    private Calendar expiryDate;
    private double value;
    private String beneficiary;

    public BBBankBillet(String payer, String beneficiary, double value, Calendar expiryDate, int ourNumber) {
    	this.payer = payer;
    	this.beneficiary = beneficiary;
    	this.value = Double.valueOf(String.format(Locale.US, "%.2f", value));
    	this.expiryDate = expiryDate;
    	this.ourBBNumber = ourNumber;
    }

	@Override
	public String getPayer() {
		// TODO Auto-generated method stub
		return payer;
	}

	@Override
	public String getBeneficiary() {
		// TODO Auto-generated method stub
		return beneficiary;
	}

	@Override
	public Calendar getEpiryDate() {
		// TODO Auto-generated method stub
		return expiryDate;
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return Double.valueOf(String.format(Locale.US, "%.2f", value));
	}
	
	 public String toString() {
		 return "ItauBoleto [payer = " + payer + ", ourNumber = " + ourBBNumber
	            + ", expiryDate = " + expiryDate.getTime() + ", value = " + Double.valueOf(String.format(Locale.US, "%.2f", value))
	            + ", beneficiary = " + beneficiary + "]";
	 }
}
