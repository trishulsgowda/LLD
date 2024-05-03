package com.paymentservice;

public class BankPaymentFactory extends PaymentMethodFactory {

	PaymentDetails paymentDetails;
	
	public BankPaymentFactory(PaymentDetails paymentDetails) {
		super();
		this.paymentDetails = paymentDetails;
	}
	
	@Override
	public PaymentMethod createPaymentMethod() {
		return new BankPayment();
	}

}
