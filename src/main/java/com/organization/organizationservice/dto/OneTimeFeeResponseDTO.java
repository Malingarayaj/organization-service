package com.organization.organizationservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class OneTimeFeeResponseDTO {
	
   

	private @JsonProperty("type") String type;
	
	private @JsonProperty("amount")  double amount;
	
	private @JsonProperty("payByDate")  String payByDate;
	
	private  @JsonProperty("oneTimeFeeId") String oneTimeFeeId;
	
	private @JsonProperty("withDiscountAmount")  double withDiscountAmount;
	
	private @JsonProperty("discountAmount")  double discountAmount;	

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public double getWithDiscountAmount() {
		return withDiscountAmount;
	}

	public void setWithDiscountAmount(double withDiscountAmount) {
		this.withDiscountAmount = withDiscountAmount;
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

	public String getPayByDate() {
		return payByDate;
	}

	public void setPayByDate(String payByDate) {
		this.payByDate = payByDate;
	}

	public String getOneTimeFeeId() {
		return oneTimeFeeId;
	}

	public void setOneTimeFeeId(String oneTimeFeeId) {
		this.oneTimeFeeId = oneTimeFeeId;
	}
	
	 @Override
		public String toString() {
			return "OneTimeFeeResponseDTO [type=" + type + ", amount=" + amount
					+ ", payByDate=" + payByDate + ", oneTimeFeeId=" + oneTimeFeeId
					+ ", withDiscountAmount=" + withDiscountAmount
					+ ", discountAmount=" + discountAmount + "]";
		}
	

}
