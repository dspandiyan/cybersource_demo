package com.gp.cybersource.common.dto;

import java.io.Serializable;
import java.math.BigInteger;

public class CardRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String fullName;
	private String accountNumber;
	private BigInteger expirationMonth;
	private BigInteger expirationYear;
	private String cvIndicator;
	private String cvNumber;
	private String cardType;
	private String issueNumber;
	private BigInteger startMonth;
	private BigInteger startYear;
	private String pin;
	private String accountEncoderID;
	private String bin;
	private String encryptedData;
	private String suffix;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigInteger getExpirationMonth() {
		return expirationMonth;
	}

	public void setExpirationMonth(BigInteger expirationMonth) {
		this.expirationMonth = expirationMonth;
	}

	public BigInteger getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(BigInteger expirationYear) {
		this.expirationYear = expirationYear;
	}

	public String getCvIndicator() {
		return cvIndicator;
	}

	public void setCvIndicator(String cvIndicator) {
		this.cvIndicator = cvIndicator;
	}

	public String getCvNumber() {
		return cvNumber;
	}

	public void setCvNumber(String cvNumber) {
		this.cvNumber = cvNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(String issueNumber) {
		this.issueNumber = issueNumber;
	}

	public BigInteger getStartMonth() {
		return startMonth;
	}

	public void setStartMonth(BigInteger startMonth) {
		this.startMonth = startMonth;
	}

	public BigInteger getStartYear() {
		return startYear;
	}

	public void setStartYear(BigInteger startYear) {
		this.startYear = startYear;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getAccountEncoderID() {
		return accountEncoderID;
	}

	public void setAccountEncoderID(String accountEncoderID) {
		this.accountEncoderID = accountEncoderID;
	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public String getEncryptedData() {
		return encryptedData;
	}

	public void setEncryptedData(String encryptedData) {
		this.encryptedData = encryptedData;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

}
