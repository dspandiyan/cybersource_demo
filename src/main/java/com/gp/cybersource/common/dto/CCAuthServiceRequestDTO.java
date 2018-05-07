package com.gp.cybersource.common.dto;

import java.io.Serializable;
import java.math.BigInteger;

public class CCAuthServiceRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cavv;
	private String cavvAlgorithm;
	private String commerceIndicator;
	private String eciRaw;
	private String xid;
	private String reconciliationID;
	private String avsLevel;
	private String fxQuoteID;
	private String returnAuthRecord;
	private String authType;
	private String verbalAuthCode;
	private String billPayment;
	private String authenticationXID;
	private String authorizationXID;
	private String industryDatatype;
	private String traceNumber;
	private String checksumKey;
	private String aggregatorID;
	private String aggregatorName;
	private String splitTenderIndicator;
	private String veresEnrolled;
	private String paresStatus;
	private String partialAuthIndicator;
	private String captureDate;
	private String firstRecurringPayment;
	private BigInteger duration;
	private String run;

	public String getCavv() {
		return cavv;
	}

	public void setCavv(String cavv) {
		this.cavv = cavv;
	}

	public String getCavvAlgorithm() {
		return cavvAlgorithm;
	}

	public void setCavvAlgorithm(String cavvAlgorithm) {
		this.cavvAlgorithm = cavvAlgorithm;
	}

	public String getCommerceIndicator() {
		return commerceIndicator;
	}

	public void setCommerceIndicator(String commerceIndicator) {
		this.commerceIndicator = commerceIndicator;
	}

	public String getEciRaw() {
		return eciRaw;
	}

	public void setEciRaw(String eciRaw) {
		this.eciRaw = eciRaw;
	}

	public String getXid() {
		return xid;
	}

	public void setXid(String xid) {
		this.xid = xid;
	}

	public String getReconciliationID() {
		return reconciliationID;
	}

	public void setReconciliationID(String reconciliationID) {
		this.reconciliationID = reconciliationID;
	}

	public String getAvsLevel() {
		return avsLevel;
	}

	public void setAvsLevel(String avsLevel) {
		this.avsLevel = avsLevel;
	}

	public String getFxQuoteID() {
		return fxQuoteID;
	}

	public void setFxQuoteID(String fxQuoteID) {
		this.fxQuoteID = fxQuoteID;
	}

	public String getReturnAuthRecord() {
		return returnAuthRecord;
	}

	public void setReturnAuthRecord(String returnAuthRecord) {
		this.returnAuthRecord = returnAuthRecord;
	}

	public String getAuthType() {
		return authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getVerbalAuthCode() {
		return verbalAuthCode;
	}

	public void setVerbalAuthCode(String verbalAuthCode) {
		this.verbalAuthCode = verbalAuthCode;
	}

	public String getBillPayment() {
		return billPayment;
	}

	public void setBillPayment(String billPayment) {
		this.billPayment = billPayment;
	}

	public String getAuthenticationXID() {
		return authenticationXID;
	}

	public void setAuthenticationXID(String authenticationXID) {
		this.authenticationXID = authenticationXID;
	}

	public String getAuthorizationXID() {
		return authorizationXID;
	}

	public void setAuthorizationXID(String authorizationXID) {
		this.authorizationXID = authorizationXID;
	}

	public String getIndustryDatatype() {
		return industryDatatype;
	}

	public void setIndustryDatatype(String industryDatatype) {
		this.industryDatatype = industryDatatype;
	}

	public String getTraceNumber() {
		return traceNumber;
	}

	public void setTraceNumber(String traceNumber) {
		this.traceNumber = traceNumber;
	}

	public String getChecksumKey() {
		return checksumKey;
	}

	public void setChecksumKey(String checksumKey) {
		this.checksumKey = checksumKey;
	}

	public String getAggregatorID() {
		return aggregatorID;
	}

	public void setAggregatorID(String aggregatorID) {
		this.aggregatorID = aggregatorID;
	}

	public String getAggregatorName() {
		return aggregatorName;
	}

	public void setAggregatorName(String aggregatorName) {
		this.aggregatorName = aggregatorName;
	}

	public String getSplitTenderIndicator() {
		return splitTenderIndicator;
	}

	public void setSplitTenderIndicator(String splitTenderIndicator) {
		this.splitTenderIndicator = splitTenderIndicator;
	}

	public String getVeresEnrolled() {
		return veresEnrolled;
	}

	public void setVeresEnrolled(String veresEnrolled) {
		this.veresEnrolled = veresEnrolled;
	}

	public String getParesStatus() {
		return paresStatus;
	}

	public void setParesStatus(String paresStatus) {
		this.paresStatus = paresStatus;
	}

	public String getPartialAuthIndicator() {
		return partialAuthIndicator;
	}

	public void setPartialAuthIndicator(String partialAuthIndicator) {
		this.partialAuthIndicator = partialAuthIndicator;
	}

	public String getCaptureDate() {
		return captureDate;
	}

	public void setCaptureDate(String captureDate) {
		this.captureDate = captureDate;
	}

	public String getFirstRecurringPayment() {
		return firstRecurringPayment;
	}

	public void setFirstRecurringPayment(String firstRecurringPayment) {
		this.firstRecurringPayment = firstRecurringPayment;
	}

	public BigInteger getDuration() {
		return duration;
	}

	public void setDuration(BigInteger duration) {
		this.duration = duration;
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

}
