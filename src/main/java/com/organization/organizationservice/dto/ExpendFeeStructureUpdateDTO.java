package com.organization.organizationservice.dto;

import java.util.ArrayList;
import java.util.List;

public class ExpendFeeStructureUpdateDTO {
	 private String name;
		
		private String year;		
		
		private List<OneTimeFeeResponseDTO> oneTimeFees=new ArrayList<OneTimeFeeResponseDTO>();
		
		private List<RecurringFeeResponseDTO> recurringFees=new ArrayList<RecurringFeeResponseDTO>();

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		

		public List<OneTimeFeeResponseDTO> getOneTimeFees() {
			return oneTimeFees;
		}

		public void setOneTimeFees(List<OneTimeFeeResponseDTO> oneTimeFees) {
			this.oneTimeFees = oneTimeFees;
		}

		public List<RecurringFeeResponseDTO> getRecurringFees() {
			return recurringFees;
		}

		public void setRecurringFees(List<RecurringFeeResponseDTO> recurringFees) {
			this.recurringFees = recurringFees;
		}

}
