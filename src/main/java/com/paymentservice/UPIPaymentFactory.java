package com.paymentservice;

public class UPIPaymentFactory extends PaymentMethodFactory {

	PaymentDetails paymentDetails;
	
	public UPIPaymentFactory(PaymentDetails paymentDetails) {
		super();
		this.paymentDetails = paymentDetails;
	}
	
	@Override
	public PaymentMethod createPaymentMethod() {
		return new UPIPayment();
	}

}
