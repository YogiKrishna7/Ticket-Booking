package com.ticketbooking.app;

public class Payment_method {
	int payment_method_id;
    String payment_method_name;
	public Payment_method(int payment_method_id, String payment_method_name) {
		super();
		this.payment_method_id = payment_method_id;
		this.payment_method_name = payment_method_name;
	}
	public int getPayment_method_id() {
		return payment_method_id;
	}
	public void setPayment_method_id(int payment_method_id) {
		this.payment_method_id = payment_method_id;
	}
	public String getPayment_method_name() {
		return payment_method_name;
	}
	public void setPayment_method_name(String payment_method_name) {
		this.payment_method_name = payment_method_name;
	}
    
    
}
