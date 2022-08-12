package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class TransactionResponseDTO {

	private String year;

	private String paymentDetails;

	private String modeOfpayment;

	private String receivedBy;

	private String receiptId;
	
	private int transactionId;
	
	private String studentName;
	
	private String studentrollNumber;
	
	private String transactionDate;
	
	private List<FeeDetailsResponseDTO> feeDetails=new ArrayList<FeeDetailsResponseDTO>();
	
	
	
	public String getStudentrollNumber() {
		return studentrollNumber;
	}

	public void setStudentrollNumber(String studentrollNumber) {
		this.studentrollNumber = studentrollNumber;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public String getModeOfpayment() {
		return modeOfpayment;
	}

	public void setModeOfpayment(String modeOfpayment) {
		this.modeOfpayment = modeOfpayment;
	}

	public String getReceivedBy() {
		return receivedBy;
	}

	public void setReceivedBy(String receivedBy) {
		this.receivedBy = receivedBy;
	}

	public String getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<FeeDetailsResponseDTO> getFeeDetails() {
		return feeDetails;
	}

	public void setFeeDetails(List<FeeDetailsResponseDTO> feeDetails) {
		this.feeDetails = feeDetails;
	}
	
	
	
	
}
