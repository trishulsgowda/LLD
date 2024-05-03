package com.paymentservice;

public class BankPayment implements PaymentMethod {

	public void pay() {
		System.out.println("Paying with Bank");
	}

}
