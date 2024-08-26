package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;


public class TransactionDTO {

	private String year;

	private String paymentDetails;

	private String modeOfpayment;

	private String receivedBy;

	private String receiptId;    

	private List<FeeDetailsDTO> feeDetails=new ArrayList<FeeDetailsDTO>();
	
	public List<FeeDetailsDTO> getFeeDetails() {
		return feeDetails;
	}

	public void setFeeDetails(List<FeeDetailsDTO> feeDetails) {
		this.feeDetails = feeDetails;
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
	
	
}
