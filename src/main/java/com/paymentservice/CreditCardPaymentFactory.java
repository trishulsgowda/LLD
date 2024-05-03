package com.paymentservice;

public class CreditCardPaymentFactory extends PaymentMethodFactory {
	
	PaymentDetails paymentDetails;
	
	public CreditCardPaymentFactory(PaymentDetails paymentDetails) {
		super();
		this.paymentDetails = paymentDetails;
	}

	@Override
	public PaymentMethod createPaymentMethod() {
		
		CreditCardPayment creditCardPayment = new CreditCardPayment(this.paymentDetails.getCreditCardNumber(), this.paymentDetails.getCreditCardExpiryDate(), this.paymentDetails.getCreditCardCVV());
		return creditCardPayment;
	}

}
