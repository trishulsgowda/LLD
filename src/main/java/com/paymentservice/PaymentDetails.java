package com.paymentservice;

public class PaymentDetails {

	private String creditCardNumber;
	private String creditCardExpiryDate;
	private String creditCardCVV;
	
	private String bankAccountNumber;
	private String IFSCCode;
	private String UPIID;
	
	private PaymentDetails(String creditCardNumber, String creditCardExpiryDate, String creditCardCVV,
			String bankAccountNumber, String iFSCCode, String uPIID) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.creditCardExpiryDate = creditCardExpiryDate;
		this.creditCardCVV = creditCardCVV;
		this.bankAccountNumber = bankAccountNumber;
		IFSCCode = iFSCCode;
		UPIID = uPIID;
	}
	
	

	public static class PaymentDetailsBuilder{
		
		public String creditCardNumber;
		public String creditCardExpiryDate;
		public String creditCardCVV;
		
		public String bankAccountNumber;
		public String IFSCCode;
		public String UPIID;
		
		public PaymentDetailsBuilder() {
			// TODO Auto-generated constructor stub
		}
		
		public PaymentDetailsBuilder setCreditCardNumber(String ccNum){
			this.creditCardNumber = ccNum;
			return this;
		}
		
		public PaymentDetailsBuilder setCreditCardExpiryDate(String creditCardExpiryDate){
			this.creditCardExpiryDate = creditCardExpiryDate;
			return this;
		}
		
		public PaymentDetailsBuilder setCreditCardCVV(String creditCardCVV){
			this.creditCardCVV = creditCardCVV;
			return this;
		}
		
		public PaymentDetailsBuilder setBankAccountNumber(String bankAccountNumber){
			this.bankAccountNumber = bankAccountNumber;
			return this;
		}
		
		public PaymentDetailsBuilder setIFSCCode(String IFSCCode){
			this.IFSCCode = IFSCCode;
			return this;
		}
		
		public PaymentDetailsBuilder setUPIID(String UPIID){
			this.UPIID = UPIID;
			return this;
		}
		
		public PaymentDetails build(){
			return new PaymentDetails(creditCardNumber, creditCardExpiryDate, creditCardCVV, bankAccountNumber, IFSCCode, UPIID);
		}
	}



	public String getCreditCardNumber() {
		return creditCardNumber;
	}



	public String getCreditCardExpiryDate() {
		return creditCardExpiryDate;
	}



	public String getCreditCardCVV() {
		return creditCardCVV;
	}



	public String getBankAccountNumber() {
		return bankAccountNumber;
	}



	public String getIFSCCode() {
		return IFSCCode;
	}



	public String getUPIID() {
		return UPIID;
	}
}
