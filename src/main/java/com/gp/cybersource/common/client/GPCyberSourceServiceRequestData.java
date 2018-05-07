package com.gp.cybersource.common.client;

import java.io.Serializable;
import java.util.Map;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;

public class GPCyberSourceServiceRequestData implements Serializable {

	private static final long serialVersionUID = 1L;

	private String serviceBaseUri;

	private String serviceOperation;

	private String securementUsername;

	private String securementAction;

	private String securementPassword;

	private String authUserId;

	private String authPassword;

	private Integer maxReqsInOneCall;

	private String contextPath;

	private String tokenId;

	private Map<String, String> requestHeader;

	private Integer maxTotalConnections;

	private String maxTotalServiceConnections;

	private Integer connectionTimeOut;

	private Integer readTimeOut;

	private Jaxb2Marshaller marshaller;

	public String getServiceBaseUri() {
		return serviceBaseUri;
	}

	public void setServiceBaseUri(String serviceBaseUri) {
		this.serviceBaseUri = serviceBaseUri;
	}

	public String getServiceOperation() {
		return serviceOperation;
	}

	public void setServiceOperation(String serviceOperation) {
		this.serviceOperation = serviceOperation;
	}

	public String getSecurementUsername() {
		return securementUsername;
	}

	public void setSecurementUsername(String securementUsername) {
		this.securementUsername = securementUsername;
	}

	public String getSecurementAction() {
		return securementAction;
	}

	public void setSecurementAction(String securementAction) {
		this.securementAction = securementAction;
	}

	public String getSecurementPassword() {
		return securementPassword;
	}

	public void setSecurementPassword(String securementPassword) {
		this.securementPassword = securementPassword;
	}

	public String getAuthUserId() {
		return authUserId;
	}

	public void setAuthUserId(String authUserId) {
		this.authUserId = authUserId;
	}

	public String getAuthPassword() {
		return authPassword;
	}

	public void setAuthPassword(String authPassword) {
		this.authPassword = authPassword;
	}

	public Integer getMaxReqsInOneCall() {
		return maxReqsInOneCall;
	}

	public void setMaxReqsInOneCall(Integer maxReqsInOneCall) {
		this.maxReqsInOneCall = maxReqsInOneCall;
	}

	public String getContextPath() {
		return contextPath;
	}

	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public Map<String, String> getRequestHeader() {
		return requestHeader;
	}

	public void setRequestHeader(Map<String, String> requestHeader) {
		this.requestHeader = requestHeader;
	}

	public Integer getMaxTotalConnections() {
		return maxTotalConnections;
	}

	public void setMaxTotalConnections(Integer maxTotalConnections) {
		this.maxTotalConnections = maxTotalConnections;
	}

	public String getMaxTotalServiceConnections() {
		return maxTotalServiceConnections;
	}

	public void setMaxTotalServiceConnections(String maxTotalServiceConnections) {
		this.maxTotalServiceConnections = maxTotalServiceConnections;
	}

	public Integer getConnectionTimeOut() {
		return connectionTimeOut;
	}

	public void setConnectionTimeOut(Integer connectionTimeOut) {
		this.connectionTimeOut = connectionTimeOut;
	}

	public Integer getReadTimeOut() {
		return readTimeOut;
	}

	public void setReadTimeOut(Integer readTimeOut) {
		this.readTimeOut = readTimeOut;
	}

	public Jaxb2Marshaller getMarshaller() {
		return marshaller;
	}

	public void setMarshaller(Jaxb2Marshaller marshaller) {
		this.marshaller = marshaller;
	}

}
