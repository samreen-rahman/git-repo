package com.lti.model;

import java.time.LocalDate;

public class Transaction {
	int transactionId;
	double amount;
	LocalDate transactinDate;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getTransactinDate() {
		return transactinDate;
	}
	public void setTransactinDate(LocalDate transactinDate) {
		this.transactinDate = transactinDate;
	}
}
