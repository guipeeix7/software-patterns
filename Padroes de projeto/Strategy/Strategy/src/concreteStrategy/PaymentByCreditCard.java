package concreteStrategy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import strategy.Payment;

public class PaymentByCreditCard implements Payment {
	
	private String creditCardOwnerName;
	private String creditCardNumber;
	private int creditCardCheckerCode;
	private String creditCardExpiryDate;
	
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

	public PaymentByCreditCard(String creditCardOwnerName, String creditCardNumber, int creditCardCheckerCode, Calendar creditCardExpiryDate) {
		this.creditCardOwnerName = creditCardOwnerName;
		this.creditCardNumber = creditCardNumber;
		this.creditCardCheckerCode = creditCardCheckerCode;
		this.creditCardExpiryDate = simpleDateFormat.format(creditCardExpiryDate.getTime());
	}
	
	@Override
	public void pay(double amount) {
		// Payment Strategy by using a Credit Card
		//Here is the place to implements the details to deal with a payment by using a Credit Card
		double formattedAmount = Double.valueOf(String.format(Locale.UK,  "%.2f", amount));
		System.out.println(formattedAmount + " paid with credit/debit card");
		System.out.println("The credit card's details are:");
		System.out.println("Credit Card's Owner Name: " + this.creditCardOwnerName);
		System.out.println("Credit Card's Owner Number: " + this.creditCardNumber);
		System.out.println("Credit Card's Owner Checker Code: " + this.creditCardCheckerCode);
		System.out.println("Credit Card's Owner Expiry Date: " + this.creditCardExpiryDate);
	}
}
