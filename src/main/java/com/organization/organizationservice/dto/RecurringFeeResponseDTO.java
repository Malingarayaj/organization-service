package com.organization.organizationservice.dto;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RecurringFeeResponseDTO {
	
   

	private @JsonProperty("type") String type;
	
	private @JsonProperty("amount") double amount;
	
	private @JsonProperty("mode") String mode;
	
	private @JsonProperty("recurringId")  String recurringId;
	
	private @JsonProperty("noOfInstalments") int noOfInstalments;
	
	private  @JsonProperty("withDiscountAmount") double withDiscountAmount;	
	
	private @JsonProperty("installmentDetails")  String[] installmentDetails;
	
	private @JsonProperty("discountAmount")  double discountAmount;	

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}	

	public String[] getInstallmentDetails() {
		return installmentDetails;
	}

	public void setInstallmentDetails(String[] installmentDetails) {
		this.installmentDetails = installmentDetails;
	}

	public double getWithDiscountAmount() {
		return withDiscountAmount;
	}

	public void setWithDiscountAmount(double withDiscountAmount) {
		this.withDiscountAmount = withDiscountAmount;
	}
	
	
	public int getNoOfInstalments() {
		return noOfInstalments;
	}

	public void setNoOfInstalments(int noOfInstalments) {
		this.noOfInstalments = noOfInstalments;
	}

	public String getRecurringId() {
		return recurringId;
	}

	public void setRecurringId(String recurringId) {
		this.recurringId = recurringId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
	 @Override
		public String toString() {
			return "RecurringFeeResponseDTO [type=" + type + ", amount=" + amount
					+ ", mode=" + mode + ", recurringId=" + recurringId
					+ ", noOfInstalments=" + noOfInstalments
					+ ", withDiscountAmount=" + withDiscountAmount
					+ ", installmentDetails=" + Arrays.toString(installmentDetails)
					+ ", discountAmount=" + discountAmount + "]";
		}
}
