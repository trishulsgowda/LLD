package com.paymentservice;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {

	private static PaymentService paymentService;
	
	private List<Notifier> notifiers = new ArrayList<Notifier>();
	
	private PaymentMethod paymentMethod;
	
	private PaymentService(){
		
	}
	
	public static PaymentService getInstance(){
		if(paymentService == null){
			paymentService = new PaymentService();
		}
		return paymentService;
	}
	
	public void addNotifier(Notifier notifier){
		this.notifiers.add(notifier);
	}
	
	public void removeNotifier(Notifier notifier){
		this.notifiers.remove(notifier);
	}
	
	public void updatePaymentStatus(){
		for(Notifier notifier: notifiers){
			notifier.sendUpdate();
		}
	}
	
	public void addPaymentMethod(PaymentMethod paymentMethod){
		this.paymentMethod = paymentMethod;
	}
	
	public void pay(){
		this.paymentMethod.pay();
		updatePaymentStatus();
	}
}
