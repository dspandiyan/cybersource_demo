package com.gp.cybersource.client.app.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;

import com.gp.cybersource.client.app.GpCyberSourceCreditCardAuthClient;
import com.gp.cybersource.client.soap.GpCyberSourceSoapClient;
import com.gp.cybersource.common.client.GPCyberSourceServiceRequestData;
import com.gp.cybersource.common.dto.CreditCardAuthRequestDTO;
import com.gp.cybersource.common.dto.CreditCardAuthResponseDTO;
import com.gp.cybersource.common.stub.ReplyMessage;
import com.gp.cybersource.common.stub.RequestMessage;
import com.gp.cybersource.mapper.CreditCardAuthRequestResponseMapper;

@Component
public class GpCyberSourceCreditCardAuthClientImpl implements GpCyberSourceCreditCardAuthClient {

	@Resource
	private CreditCardAuthRequestResponseMapper reqResMapper;

	@Resource
	private GpCyberSourceSoapClient soapClient;

	@Resource
	private Jaxb2Marshaller cyberSourceMarshaller;

	public CreditCardAuthResponseDTO authCreditCard(CreditCardAuthRequestDTO creditCardAuthReqDTO,
			GPCyberSourceServiceRequestData serviceRequestData) {
		final RequestMessage creditCardAuthRequest = reqResMapper.createCreditCardAuthRequest(creditCardAuthReqDTO);
		populateCyberSourceRequestData(serviceRequestData);
		final ReplyMessage creditCardAuthResponse = soapClient.getResponse(creditCardAuthRequest, serviceRequestData,
				serviceRequestData.getRequestHeader());
		return reqResMapper.createCreditCardAuthResponse(creditCardAuthResponse);
	}

	public GPCyberSourceServiceRequestData populateCyberSourceRequestData(
			final GPCyberSourceServiceRequestData requestData) {
		updateRequestHeader(requestData);
		requestData.setServiceBaseUri("https://ics2wstesta.ic3.com:443/commerce/1.x/transactionProcessor");
		requestData.setContextPath("com.gp.cybersource.common.stub");
		requestData.setSecurementAction("Timestamp UsernameToken");
		requestData.setSecurementUsername("deloitteintg");
		requestData.setSecurementPassword(
				"ze0lI5zoNM1AEEBcysmlk3gY6XAONsqxHtv3eKXF8dLt1pQwXifM5VJV+UWbm0J2ksqemCOqdXPyukEmzQQQtrKxTxtEog4zlIGYxhyTSaxuBN1jVBA6Myd/4FOIhELGdYNUBrvvsaz8box7ON0D13XCpAiJC1LlwShBOiO6/13/44d+JwBXsb5Qx2AZD358HfHHruP0UKCDZ7r3aKW7OE4t7dwJoVkrOYx/VCML0SGFcPl++k6eTHBnFE26CCY8a9PBrHbzYRtw1qHB5HGeeyoTr/zm+pVWUCMlDiQxTHqTzrErH2GgDwcRcQKLUi+r8MyYeDx9WXXYa2RJ3RBGXQ==");
		requestData.setServiceOperation("runTransaction");
		requestData.setMarshaller(cyberSourceMarshaller);
		requestData.setMaxTotalConnections(10);
		requestData.setMaxTotalServiceConnections("10");
		requestData.setConnectionTimeOut(6000);
		requestData.setReadTimeOut(6000);
		return requestData;
	}

	private void updateRequestHeader(final GPCyberSourceServiceRequestData requestData) {

		final Map<String, String> serviceRequestHeader = new HashMap<>();

		requestData.setRequestHeader(serviceRequestHeader);

	}
}
