package com.paymentservice;

public class CreditCardPayment implements PaymentMethod {

	public String creditCardNumber;
	public String creditCardExpiryDate;
	public String creditCardCVV;
	
	
	
	public CreditCardPayment() {
		super();
	}

	public CreditCardPayment(String creditCardNumber, String creditCardExpiryDate, String creditCardCVV) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.creditCardExpiryDate = creditCardExpiryDate;
		this.creditCardCVV = creditCardCVV;
	}

	public void pay() {
		System.out.println("Paying with Credit card");
	}

}
