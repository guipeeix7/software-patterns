package concreteBuilder;

import java.util.Calendar;
import java.util.Locale;
import product.BankBillet;
import product.ItauBankBillet;
import builder.BankBilletBuilder;

public class ItauBankBilletBuilder implements BankBilletBuilder {
	
	private String payer;
    private String beneficiary;
    private double value;
    private Calendar expiryDate;
    private int ourItauNumber;

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
		this.ourItauNumber = ourNumber;	
	}

	@Override
	public BankBillet getBankBillet() {
		return new ItauBankBillet(payer, beneficiary, Double.valueOf(String.format(Locale.US, "%.2f", value)), expiryDate, ourItauNumber);
	}

}
