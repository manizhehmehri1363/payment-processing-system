package io.github.manizhehmehri1363.paymentsystem;

public  abstract class Payment {
	protected double amount;
	
	public Payment(double amount) {
		this.amount = amount;
	}
	
	public abstract void processPayment();
	
	public void schowAmount() {
		System.out.println("Amount:$" + amount);
	}

}
