package com.paymentclient;

import com.paymentservice.EmailNotifier;
import com.paymentservice.PaymentDetails;
import com.paymentservice.PaymentMethodFactory;
import com.paymentservice.PaymentService;
import com.paymentservice.SMSNotifier;
import com.paymentservice.UPIPaymentFactory;

public class PaymentClient {

	public static void main(String[] args) {
		// Get an instance of payment service
		// call pay method
		
		PaymentService paymentService = PaymentService.getInstance();
		
		paymentService.addNotifier(new SMSNotifier());
		paymentService.addNotifier(new EmailNotifier());
		
		
		PaymentDetails.PaymentDetailsBuilder paymentDetailsBuilder = new PaymentDetails.PaymentDetailsBuilder();
		paymentDetailsBuilder.setCreditCardNumber("123456789123");
		paymentDetailsBuilder.setCreditCardCVV("123");
		paymentDetailsBuilder.setCreditCardExpiryDate("01052025");
		
		PaymentDetails paymentDetails = paymentDetailsBuilder.build();
		
		PaymentMethodFactory factory = new UPIPaymentFactory(paymentDetails);
		
		paymentService.addPaymentMethod(factory.createPaymentMethod());
		
		paymentService.pay();
	}
}
