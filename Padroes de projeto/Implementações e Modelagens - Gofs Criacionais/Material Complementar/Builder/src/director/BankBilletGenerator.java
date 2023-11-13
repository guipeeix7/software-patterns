package director;

import java.util.Calendar;
import product.BankBillet;
import builder.BankBilletBuilder;

public class BankBilletGenerator {
	
	private BankBilletBuilder bankBilletBuilder;
	
	public BankBilletGenerator(BankBilletBuilder bankBilletBuilder) {
        super();
        this.bankBilletBuilder = bankBilletBuilder;
    }
    public  BankBillet constructBankBillet(){
    	//bank billet information
    	bankBilletBuilder.buildPayer("Camilo Lopes");
    	bankBilletBuilder.buildBeneficiary("Disney");
    	bankBilletBuilder.buildValue(2000.00);
        Calendar expiryDate = Calendar.getInstance();
        expiryDate.add(Calendar.DATE, 20);
        bankBilletBuilder.buildExpiryDate(expiryDate);
        bankBilletBuilder.buildOurNumber(1234);
    
        //Aqui é interessante!
        BankBillet bankBillet = bankBilletBuilder.getBankBillet();
        return bankBillet;
    }
	
	

}
