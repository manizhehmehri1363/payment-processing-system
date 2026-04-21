package io.github.manizhehmehri1363.paymentsystem;

public class PayPalPayment extends Payment {
	
	private String email;

	public PayPalPayment(double amount, String email) {
		super(amount);
		this.email = email;
	}
	@Override
	public void processPayment() {
		System.out.println("Paying $" + amount + " with PayPal account : " + email);
	}

}
