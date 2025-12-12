package com.sai.corejava;

import java.util.Date;

public class Transaction {
	
	private int transactionDate;
	private Date transcationDate;
	private double transactionAmount;
	
	public int getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(int transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Date getTranscationDate() {
		return transcationDate;
	}
	public void setTranscationDate(Date transcationDate) {
		this.transcationDate = transcationDate;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	@Override
	public String toString() {
		return "Transaction [transactionDate=" + transactionDate + ", transcationDate=" + transcationDate
				+ ", transactionAmount=" + transactionAmount + "]";
	}
	public Transaction(int transactionDate, Date transcationDate, double transactionAmount) {
		super();
		this.transactionDate = transactionDate;
		this.transcationDate = transcationDate;
		this.transactionAmount = transactionAmount;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
