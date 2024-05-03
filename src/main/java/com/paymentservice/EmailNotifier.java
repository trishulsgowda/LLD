package com.paymentservice;

public class EmailNotifier implements Notifier {

	public void sendUpdate() {
		System.out.println("Send Payment Update via Email");
	}

}
