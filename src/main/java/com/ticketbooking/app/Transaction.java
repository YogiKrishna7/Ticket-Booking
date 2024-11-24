package com.ticketbooking.app;

public class Transaction {
	int txn_id;
    String txn_date;
    int booking_number;
    double txn_amt;
    char txn_status;
    int payment_method_id;
	public Transaction(int txn_id, String txn_date, int booking_number, double txn_amt, char txn_status,
			int payment_method_id) {
		super();
		this.txn_id = txn_id;
		this.txn_date = txn_date;
		this.booking_number = booking_number;
		this.txn_amt = txn_amt;
		this.txn_status = txn_status;
		this.payment_method_id = payment_method_id;
	}
	public int getTxn_id() {
		return txn_id;
	}
	public void setTxn_id(int txn_id) {
		this.txn_id = txn_id;
	}
	public String getTxn_date() {
		return txn_date;
	}
	public void setTxn_date(String txn_date) {
		this.txn_date = txn_date;
	}
	public int getBooking_number() {
		return booking_number;
	}
	public void setBooking_number(int booking_number) {
		this.booking_number = booking_number;
	}
	public double getTxn_amt() {
		return txn_amt;
	}
	public void setTxn_amt(double txn_amt) {
		this.txn_amt = txn_amt;
	}
	public char getTxn_status() {
		return txn_status;
	}
	public void setTxn_status(char txn_status) {
		this.txn_status = txn_status;
	}
	public int getPayment_method_id() {
		return payment_method_id;
	}
	public void setPayment_method_id(int payment_method_id) {
		this.payment_method_id = payment_method_id;
	}

    
    
    
}
