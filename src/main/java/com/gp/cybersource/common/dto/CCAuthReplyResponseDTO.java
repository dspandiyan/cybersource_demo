package com.gp.cybersource.common.dto;

import java.io.Serializable;
import java.math.BigInteger;

public class CCAuthReplyResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private BigInteger reasonCode;
	private String amount;
	private String authorizationCode;
	private String avsCode;
	private String avsCodeRaw;
	private String cvCode;
	private String cvCodeRaw;
	private String personalIDCode;
	private String authorizedDateTime;
	private String processorResponse;
	private String bmlAccountNumber;
	private String authFactorCode;
	private String reconciliationID;
	private FundingTotalsResponseDTO fundingTotals;
	private String fxQuoteID;
	private String fxQuoteRate;
	private String fxQuoteType;
	private String fxQuoteExpirationDateTime;
	private String authRecord;
	private String merchantAdviceCode;
	private String merchantAdviceCodeRaw;
	private String cavvResponseCode;
	private String cavvResponseCodeRaw;
	private String authenticationXID;
	private String authorizationXID;
	private String processorCardType;
	private String accountBalance;
	private String forwardCode;
	private String enhancedDataEnabled;
	private String referralResponseNumber;
	private String subResponseCode;
	private String approvedAmount;
	private String creditLine;
	private String approvedTerms;
	private String paymentNetworkTransactionID;
	private String cardCategory;
	private String ownerMerchantID;
	private String requestAmount;
	private String requestCurrency;
	private String accountBalanceCurrency;
	private String accountBalanceSign;
	private String affluenceIndicator;
	private String evEmail;
	private String evPhoneNumber;
	private String evPostalCode;
	private String evName;
	private String evStreet;
	private String evEmailRaw;
	private String evPhoneNumberRaw;
	private String evPostalCodeRaw;
	private String evNameRaw;
	private String evStreetRaw;
	private String cardGroup;
	private String posData;
	private String transactionID;
	private String cardIssuerCountry;
	private String cardRegulated;
	private String cardCommercial;
	private String cardPrepaid;
	private String cardPayroll;
	private String cardHealthcare;
	private String cardSignatureDebit;
	private String cardPINlessDebit;
	private String cardLevel3Eligible;
	private String processorTransactionID;
	private String providerReasonCode;
	private String providerReasonDescription;
	private String providerPassThroughData;
	private String providerCVNResponseCode;
	private String providerAVSResponseCode;
	private String providerAcquirerBankCode;

	public BigInteger getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(BigInteger reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	public String getAvsCode() {
		return avsCode;
	}

	public void setAvsCode(String avsCode) {
		this.avsCode = avsCode;
	}

	public String getAvsCodeRaw() {
		return avsCodeRaw;
	}

	public void setAvsCodeRaw(String avsCodeRaw) {
		this.avsCodeRaw = avsCodeRaw;
	}

	public String getCvCode() {
		return cvCode;
	}

	public void setCvCode(String cvCode) {
		this.cvCode = cvCode;
	}

	public String getCvCodeRaw() {
		return cvCodeRaw;
	}

	public void setCvCodeRaw(String cvCodeRaw) {
		this.cvCodeRaw = cvCodeRaw;
	}

	public String getPersonalIDCode() {
		return personalIDCode;
	}

	public void setPersonalIDCode(String personalIDCode) {
		this.personalIDCode = personalIDCode;
	}

	public String getAuthorizedDateTime() {
		return authorizedDateTime;
	}

	public void setAuthorizedDateTime(String authorizedDateTime) {
		this.authorizedDateTime = authorizedDateTime;
	}

	public String getProcessorResponse() {
		return processorResponse;
	}

	public void setProcessorResponse(String processorResponse) {
		this.processorResponse = processorResponse;
	}

	public String getBmlAccountNumber() {
		return bmlAccountNumber;
	}

	public void setBmlAccountNumber(String bmlAccountNumber) {
		this.bmlAccountNumber = bmlAccountNumber;
	}

	public String getAuthFactorCode() {
		return authFactorCode;
	}

	public void setAuthFactorCode(String authFactorCode) {
		this.authFactorCode = authFactorCode;
	}

	public String getReconciliationID() {
		return reconciliationID;
	}

	public void setReconciliationID(String reconciliationID) {
		this.reconciliationID = reconciliationID;
	}

	public FundingTotalsResponseDTO getFundingTotals() {
		return fundingTotals;
	}

	public void setFundingTotals(FundingTotalsResponseDTO fundingTotals) {
		this.fundingTotals = fundingTotals;
	}

	public String getFxQuoteID() {
		return fxQuoteID;
	}

	public void setFxQuoteID(String fxQuoteID) {
		this.fxQuoteID = fxQuoteID;
	}

	public String getFxQuoteRate() {
		return fxQuoteRate;
	}

	public void setFxQuoteRate(String fxQuoteRate) {
		this.fxQuoteRate = fxQuoteRate;
	}

	public String getFxQuoteType() {
		return fxQuoteType;
	}

	public void setFxQuoteType(String fxQuoteType) {
		this.fxQuoteType = fxQuoteType;
	}

	public String getFxQuoteExpirationDateTime() {
		return fxQuoteExpirationDateTime;
	}

	public void setFxQuoteExpirationDateTime(String fxQuoteExpirationDateTime) {
		this.fxQuoteExpirationDateTime = fxQuoteExpirationDateTime;
	}

	public String getAuthRecord() {
		return authRecord;
	}

	public void setAuthRecord(String authRecord) {
		this.authRecord = authRecord;
	}

	public String getMerchantAdviceCode() {
		return merchantAdviceCode;
	}

	public void setMerchantAdviceCode(String merchantAdviceCode) {
		this.merchantAdviceCode = merchantAdviceCode;
	}

	public String getMerchantAdviceCodeRaw() {
		return merchantAdviceCodeRaw;
	}

	public void setMerchantAdviceCodeRaw(String merchantAdviceCodeRaw) {
		this.merchantAdviceCodeRaw = merchantAdviceCodeRaw;
	}

	public String getCavvResponseCode() {
		return cavvResponseCode;
	}

	public void setCavvResponseCode(String cavvResponseCode) {
		this.cavvResponseCode = cavvResponseCode;
	}

	public String getCavvResponseCodeRaw() {
		return cavvResponseCodeRaw;
	}

	public void setCavvResponseCodeRaw(String cavvResponseCodeRaw) {
		this.cavvResponseCodeRaw = cavvResponseCodeRaw;
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

	public String getProcessorCardType() {
		return processorCardType;
	}

	public void setProcessorCardType(String processorCardType) {
		this.processorCardType = processorCardType;
	}

	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getForwardCode() {
		return forwardCode;
	}

	public void setForwardCode(String forwardCode) {
		this.forwardCode = forwardCode;
	}

	public String getEnhancedDataEnabled() {
		return enhancedDataEnabled;
	}

	public void setEnhancedDataEnabled(String enhancedDataEnabled) {
		this.enhancedDataEnabled = enhancedDataEnabled;
	}

	public String getReferralResponseNumber() {
		return referralResponseNumber;
	}

	public void setReferralResponseNumber(String referralResponseNumber) {
		this.referralResponseNumber = referralResponseNumber;
	}

	public String getSubResponseCode() {
		return subResponseCode;
	}

	public void setSubResponseCode(String subResponseCode) {
		this.subResponseCode = subResponseCode;
	}

	public String getApprovedAmount() {
		return approvedAmount;
	}

	public void setApprovedAmount(String approvedAmount) {
		this.approvedAmount = approvedAmount;
	}

	public String getCreditLine() {
		return creditLine;
	}

	public void setCreditLine(String creditLine) {
		this.creditLine = creditLine;
	}

	public String getApprovedTerms() {
		return approvedTerms;
	}

	public void setApprovedTerms(String approvedTerms) {
		this.approvedTerms = approvedTerms;
	}

	public String getPaymentNetworkTransactionID() {
		return paymentNetworkTransactionID;
	}

	public void setPaymentNetworkTransactionID(String paymentNetworkTransactionID) {
		this.paymentNetworkTransactionID = paymentNetworkTransactionID;
	}

	public String getCardCategory() {
		return cardCategory;
	}

	public void setCardCategory(String cardCategory) {
		this.cardCategory = cardCategory;
	}

	public String getOwnerMerchantID() {
		return ownerMerchantID;
	}

	public void setOwnerMerchantID(String ownerMerchantID) {
		this.ownerMerchantID = ownerMerchantID;
	}

	public String getRequestAmount() {
		return requestAmount;
	}

	public void setRequestAmount(String requestAmount) {
		this.requestAmount = requestAmount;
	}

	public String getRequestCurrency() {
		return requestCurrency;
	}

	public void setRequestCurrency(String requestCurrency) {
		this.requestCurrency = requestCurrency;
	}

	public String getAccountBalanceCurrency() {
		return accountBalanceCurrency;
	}

	public void setAccountBalanceCurrency(String accountBalanceCurrency) {
		this.accountBalanceCurrency = accountBalanceCurrency;
	}

	public String getAccountBalanceSign() {
		return accountBalanceSign;
	}

	public void setAccountBalanceSign(String accountBalanceSign) {
		this.accountBalanceSign = accountBalanceSign;
	}

	public String getAffluenceIndicator() {
		return affluenceIndicator;
	}

	public void setAffluenceIndicator(String affluenceIndicator) {
		this.affluenceIndicator = affluenceIndicator;
	}

	public String getEvEmail() {
		return evEmail;
	}

	public void setEvEmail(String evEmail) {
		this.evEmail = evEmail;
	}

	public String getEvPhoneNumber() {
		return evPhoneNumber;
	}

	public void setEvPhoneNumber(String evPhoneNumber) {
		this.evPhoneNumber = evPhoneNumber;
	}

	public String getEvPostalCode() {
		return evPostalCode;
	}

	public void setEvPostalCode(String evPostalCode) {
		this.evPostalCode = evPostalCode;
	}

	public String getEvName() {
		return evName;
	}

	public void setEvName(String evName) {
		this.evName = evName;
	}

	public String getEvStreet() {
		return evStreet;
	}

	public void setEvStreet(String evStreet) {
		this.evStreet = evStreet;
	}

	public String getEvEmailRaw() {
		return evEmailRaw;
	}

	public void setEvEmailRaw(String evEmailRaw) {
		this.evEmailRaw = evEmailRaw;
	}

	public String getEvPhoneNumberRaw() {
		return evPhoneNumberRaw;
	}

	public void setEvPhoneNumberRaw(String evPhoneNumberRaw) {
		this.evPhoneNumberRaw = evPhoneNumberRaw;
	}

	public String getEvPostalCodeRaw() {
		return evPostalCodeRaw;
	}

	public void setEvPostalCodeRaw(String evPostalCodeRaw) {
		this.evPostalCodeRaw = evPostalCodeRaw;
	}

	public String getEvNameRaw() {
		return evNameRaw;
	}

	public void setEvNameRaw(String evNameRaw) {
		this.evNameRaw = evNameRaw;
	}

	public String getEvStreetRaw() {
		return evStreetRaw;
	}

	public void setEvStreetRaw(String evStreetRaw) {
		this.evStreetRaw = evStreetRaw;
	}

	public String getCardGroup() {
		return cardGroup;
	}

	public void setCardGroup(String cardGroup) {
		this.cardGroup = cardGroup;
	}

	public String getPosData() {
		return posData;
	}

	public void setPosData(String posData) {
		this.posData = posData;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getCardIssuerCountry() {
		return cardIssuerCountry;
	}

	public void setCardIssuerCountry(String cardIssuerCountry) {
		this.cardIssuerCountry = cardIssuerCountry;
	}

	public String getCardRegulated() {
		return cardRegulated;
	}

	public void setCardRegulated(String cardRegulated) {
		this.cardRegulated = cardRegulated;
	}

	public String getCardCommercial() {
		return cardCommercial;
	}

	public void setCardCommercial(String cardCommercial) {
		this.cardCommercial = cardCommercial;
	}

	public String getCardPrepaid() {
		return cardPrepaid;
	}

	public void setCardPrepaid(String cardPrepaid) {
		this.cardPrepaid = cardPrepaid;
	}

	public String getCardPayroll() {
		return cardPayroll;
	}

	public void setCardPayroll(String cardPayroll) {
		this.cardPayroll = cardPayroll;
	}

	public String getCardHealthcare() {
		return cardHealthcare;
	}

	public void setCardHealthcare(String cardHealthcare) {
		this.cardHealthcare = cardHealthcare;
	}

	public String getCardSignatureDebit() {
		return cardSignatureDebit;
	}

	public void setCardSignatureDebit(String cardSignatureDebit) {
		this.cardSignatureDebit = cardSignatureDebit;
	}

	public String getCardPINlessDebit() {
		return cardPINlessDebit;
	}

	public void setCardPINlessDebit(String cardPINlessDebit) {
		this.cardPINlessDebit = cardPINlessDebit;
	}

	public String getCardLevel3Eligible() {
		return cardLevel3Eligible;
	}

	public void setCardLevel3Eligible(String cardLevel3Eligible) {
		this.cardLevel3Eligible = cardLevel3Eligible;
	}

	public String getProcessorTransactionID() {
		return processorTransactionID;
	}

	public void setProcessorTransactionID(String processorTransactionID) {
		this.processorTransactionID = processorTransactionID;
	}

	public String getProviderReasonCode() {
		return providerReasonCode;
	}

	public void setProviderReasonCode(String providerReasonCode) {
		this.providerReasonCode = providerReasonCode;
	}

	public String getProviderReasonDescription() {
		return providerReasonDescription;
	}

	public void setProviderReasonDescription(String providerReasonDescription) {
		this.providerReasonDescription = providerReasonDescription;
	}

	public String getProviderPassThroughData() {
		return providerPassThroughData;
	}

	public void setProviderPassThroughData(String providerPassThroughData) {
		this.providerPassThroughData = providerPassThroughData;
	}

	public String getProviderCVNResponseCode() {
		return providerCVNResponseCode;
	}

	public void setProviderCVNResponseCode(String providerCVNResponseCode) {
		this.providerCVNResponseCode = providerCVNResponseCode;
	}

	public String getProviderAVSResponseCode() {
		return providerAVSResponseCode;
	}

	public void setProviderAVSResponseCode(String providerAVSResponseCode) {
		this.providerAVSResponseCode = providerAVSResponseCode;
	}

	public String getProviderAcquirerBankCode() {
		return providerAcquirerBankCode;
	}

	public void setProviderAcquirerBankCode(String providerAcquirerBankCode) {
		this.providerAcquirerBankCode = providerAcquirerBankCode;
	}

}
