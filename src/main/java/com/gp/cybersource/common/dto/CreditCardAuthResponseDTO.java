package com.gp.cybersource.common.dto;

import java.io.Serializable;
import java.math.BigInteger;

public class CreditCardAuthResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String merchantReferenceCode;
	private String requestID;
	private String decision;
	private BigInteger reasonCode;
	private String requestToken;
	private CCAuthReplyResponseDTO cCAuthReply;
	private PurchaseTotalsDTO purchaseTotals;

	public String getMerchantReferenceCode() {
		return merchantReferenceCode;
	}

	public void setMerchantReferenceCode(String merchantReferenceCode) {
		this.merchantReferenceCode = merchantReferenceCode;
	}

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	public String getDecision() {
		return decision;
	}

	public void setDecision(String decision) {
		this.decision = decision;
	}

	public BigInteger getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(BigInteger reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getRequestToken() {
		return requestToken;
	}

	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}

	public CCAuthReplyResponseDTO getcCAuthReply() {
		return cCAuthReply;
	}

	public void setcCAuthReply(CCAuthReplyResponseDTO cCAuthReply) {
		this.cCAuthReply = cCAuthReply;
	}

	public PurchaseTotalsDTO getPurchaseTotals() {
		return purchaseTotals;
	}

	public void setPurchaseTotals(PurchaseTotalsDTO purchaseTotals) {
		this.purchaseTotals = purchaseTotals;
	}

}
