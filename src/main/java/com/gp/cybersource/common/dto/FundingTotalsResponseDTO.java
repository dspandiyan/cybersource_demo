package com.gp.cybersource.common.dto;

import java.io.Serializable;

public class FundingTotalsResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String currency;
	private String grandTotalAmount;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getGrandTotalAmount() {
		return grandTotalAmount;
	}

	public void setGrandTotalAmount(String grandTotalAmount) {
		this.grandTotalAmount = grandTotalAmount;
	}

}
