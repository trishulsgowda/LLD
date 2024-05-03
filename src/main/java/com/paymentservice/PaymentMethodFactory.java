package com.paymentservice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class PaymentMethodFactory {
	
	public String creditCardNumber;
	public String creditCardExpiryDate;
	public String creditCardCVV;
	
	public String bankAccountNumber;
	public String IFSCCode;
	public String UPIID;
	
	public abstract PaymentMethod createPaymentMethod();
	
	
}
