package io.github.manizhehmehri1363.paymentsystem;

public class CreditCardPayment extends Payment {
	
	private String cardNumber;

	public CreditCardPayment(double amount, String cardNumber ) {
		super(amount);
		this.cardNumber = cardNumber;
	}
    @Override
    public void processPayment() {
    	System.out.println(" Paying $" + amount + " with Credit Card : " + maskCardNumber());
    }
	private String maskCardNumber() {
	  return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
	
	}
}
