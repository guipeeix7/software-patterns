package product;

import java.util.Calendar;

public interface BankBillet {
	
    public String getPayer();   
    public String getBeneficiary();
    public Calendar getEpiryDate();
    public double getValue();

}
