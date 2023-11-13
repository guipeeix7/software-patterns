package concreteBuilder;

import java.util.Calendar;
import java.util.Locale;
import product.BBBankBillet;
import product.BankBillet;
import builder.BankBilletBuilder;

public class BBBankBilletBuilder implements BankBilletBuilder {
	
	private String payer;
    private String beneficiary;
    private double value;
    private Calendar expiryDate;
    private int ourBBNumber;

 	@Override
	public void buildPayer(String payer) {
		this.payer = payer;	
	}

	@Override
	public void buildBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;	
	}

	@Override
	public void buildValue(double value) {
		this.value = Double.valueOf(String.format(Locale.US, "%.2f", value));	
	}

	@Override
	public void buildExpiryDate(Calendar expiryDate) {
		this.expiryDate = expiryDate;	
	}

	@Override
	public void buildOurNumber(int ourNumber) {
		this.ourBBNumber = ourNumber;	
	}

	@Override
	public BankBillet getBankBillet() {
		return new BBBankBillet(payer, beneficiary, Double.valueOf(String.format(Locale.US, "%.2f", value)), expiryDate, ourBBNumber);
	}

}
