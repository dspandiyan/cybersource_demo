package com.gp.cybersource.common.dto;

import java.io.Serializable;

public class BaseRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String merchantID;
	private String merchantReferenceCode;
	private String debtIndicator;
	private String clientLibrary;
	private String clientLibraryVersion;
	private String clientEnvironment;
	private String clientSecurityLibraryVersion;
	private String clientApplication;
	private String clientApplicationVersion;
	private String clientApplicationUser;
	private String routingCode;
	private String comments;
	private String returnURL;

	public String getMerchantID() {
		return merchantID;
	}

	public void setMerchantID(String merchantID) {
		this.merchantID = merchantID;
	}

	public String getMerchantReferenceCode() {
		return merchantReferenceCode;
	}

	public void setMerchantReferenceCode(String merchantReferenceCode) {
		this.merchantReferenceCode = merchantReferenceCode;
	}

	public String getDebtIndicator() {
		return debtIndicator;
	}

	public void setDebtIndicator(String debtIndicator) {
		this.debtIndicator = debtIndicator;
	}

	public String getClientLibrary() {
		return clientLibrary;
	}

	public void setClientLibrary(String clientLibrary) {
		this.clientLibrary = clientLibrary;
	}

	public String getClientLibraryVersion() {
		return clientLibraryVersion;
	}

	public void setClientLibraryVersion(String clientLibraryVersion) {
		this.clientLibraryVersion = clientLibraryVersion;
	}

	public String getClientEnvironment() {
		return clientEnvironment;
	}

	public void setClientEnvironment(String clientEnvironment) {
		this.clientEnvironment = clientEnvironment;
	}

	public String getClientSecurityLibraryVersion() {
		return clientSecurityLibraryVersion;
	}

	public void setClientSecurityLibraryVersion(String clientSecurityLibraryVersion) {
		this.clientSecurityLibraryVersion = clientSecurityLibraryVersion;
	}

	public String getClientApplication() {
		return clientApplication;
	}

	public void setClientApplication(String clientApplication) {
		this.clientApplication = clientApplication;
	}

	public String getClientApplicationVersion() {
		return clientApplicationVersion;
	}

	public void setClientApplicationVersion(String clientApplicationVersion) {
		this.clientApplicationVersion = clientApplicationVersion;
	}

	public String getClientApplicationUser() {
		return clientApplicationUser;
	}

	public void setClientApplicationUser(String clientApplicationUser) {
		this.clientApplicationUser = clientApplicationUser;
	}

	public String getRoutingCode() {
		return routingCode;
	}

	public void setRoutingCode(String routingCode) {
		this.routingCode = routingCode;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getReturnURL() {
		return returnURL;
	}

	public void setReturnURL(String returnURL) {
		this.returnURL = returnURL;
	}

}
