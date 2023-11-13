package builder;

import java.util.Calendar;

import product.BankBillet;

public interface BankBilletBuilder {
	
    public void buildPayer(String payer);
    public void buildBeneficiary(String beneficiary);
    public void buildValue(double value);
    public void buildExpiryDate(Calendar expiryDate);
    public void buildOurNumber(int ourNumber);
   
    public BankBillet getBankBillet();

}
