package com.gp.cybersource.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gp.cybersource.client.app.GpCyberSourceCreditCardAuthClient;
import com.gp.cybersource.common.client.GPCyberSourceServiceRequestData;
import com.gp.cybersource.common.dto.CreditCardAuthRequestDTO;
import com.gp.cybersource.common.dto.CreditCardAuthResponseDTO;
import com.gp.cybersource.service.CreditCardAuthService;

@Service
public class CreditCardAuthServiceImpl implements CreditCardAuthService {

	@Resource(name = "gpCyberSourceCreditCardAuthClientImpl")
	private GpCyberSourceCreditCardAuthClient cyberSourceCCAuthClient;

	public CreditCardAuthResponseDTO authCreditCard(CreditCardAuthRequestDTO creditCardAuthReqDTO,
			Map<String, String> requestHeader) {
		GPCyberSourceServiceRequestData requestData = new GPCyberSourceServiceRequestData();
		requestData.setRequestHeader(requestHeader);
		return cyberSourceCCAuthClient.authCreditCard(creditCardAuthReqDTO, requestData);
	}

}
