package io.github.manizhehmehri1363.paymentsystem;

public class Main {
    public static void main(String[] args) {
    	
    	Payment credit = new CreditCardPayment(100, "1234567890123456");
    	Payment paypal = new PayPalPayment(200, "test@mail.com");
    	
    	credit.schowAmount();
    	credit.processPayment();
    	
    	System.out.println("---------------");
    	
    	paypal.schowAmount();
    	paypal.processPayment();
    }
}
