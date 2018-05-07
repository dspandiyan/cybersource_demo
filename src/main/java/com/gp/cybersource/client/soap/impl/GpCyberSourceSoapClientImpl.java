package com.gp.cybersource.client.soap.impl;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.apache.wss4j.common.WSS4JConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.SoapBody;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;

import com.gp.cybersource.client.soap.GpCyberSourceSoapClient;
import com.gp.cybersource.common.client.GPCyberSourceServiceRequestData;
import com.gp.cybersource.common.stub.ReplyMessage;

@Service
public class GpCyberSourceSoapClientImpl extends WebServiceGatewaySupport implements GpCyberSourceSoapClient {

	private static final Logger LOG = LoggerFactory.getLogger(GpCyberSourceSoapClientImpl.class);

	@Override
	public ReplyMessage getResponse(Object request, GPCyberSourceServiceRequestData requestData,
			Map<String, String> requestHeader) {
		return performRequestWithHeaders(request, requestData);
	}

	private ReplyMessage performRequestWithHeaders(Object payload, final GPCyberSourceServiceRequestData requestData) {
		// final WebServiceTemplate template = getWebServiceTemplate();
		ReplyMessage response = null;
		// template.setDefaultUri(requestData.getServiceBaseUri());
		// template.setMarshaller(requestData.getMarshaller());
		// template.setUnmarshaller(requestData.getMarshaller());
		// template.setInterceptors(getSecurityInterceptors(requestData));
		// response = (ReplyMessage) template.marshalSendAndReceive(payload,
		// getRequestCallback(requestData));
		// response = (ReplyMessage)
		// template.marshalSendAndReceive("https://ics2wstesta.ic3.com:443/commerce/1.x/transactionProcessor",
		// payload);
		getWebServiceTemplate().setDefaultUri(
				"https://ics2wstest.ic3.com/commerce/1.x/transactionProcessor/CyberSourceTransaction_1.104.wsdl");
		getWebServiceTemplate().setMarshaller(requestData.getMarshaller());
		getWebServiceTemplate().setUnmarshaller(requestData.getMarshaller());
		getWebServiceTemplate().setInterceptors(getSecurityInterceptors(requestData));
		response = (ReplyMessage) ((JAXBElement<ReplyMessage>) (getWebServiceTemplate().marshalSendAndReceive(payload,
				new SoapActionCallback("https://ics2wstesta.ic3.com/commerce/1.x/transactionProcessor")))).getValue();
		return response;
	}

	private ClientInterceptor[] getSecurityInterceptors(final GPCyberSourceServiceRequestData requestData) {
		Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
		wss4jSecurityInterceptor.setValidateResponse(Boolean.FALSE);
		wss4jSecurityInterceptor.setSecurementActions(requestData.getSecurementAction());
		wss4jSecurityInterceptor.setSecurementUsername(requestData.getSecurementUsername());
		wss4jSecurityInterceptor.setSecurementPassword(requestData.getSecurementPassword());
		wss4jSecurityInterceptor.setSecurementPasswordType(WSS4JConstants.PW_TEXT);
		return new ClientInterceptor[] { wss4jSecurityInterceptor };

	}

	private WebServiceMessageCallback getRequestCallback(final GPCyberSourceServiceRequestData requestData) {
		return new WebServiceMessageCallback() {

			@Override
			public void doWithMessage(WebServiceMessage webServiceMessage) throws IOException {
				SoapMessage soapMessage = (SoapMessage) webServiceMessage;
				soapMessage.setSoapAction(requestData.getServiceOperation());
				SoapBody soapBody = soapMessage.getEnvelope().getBody();
				System.out.println("Soap Body :" + soapBody.toString());
				Iterator<QName> name = soapMessage.getEnvelope().getAllAttributes();
				while (name.hasNext()) {
					QName value = name.next();
					System.out.println("Attributes:" + value.toString());
				}
			}
		};
	}
}