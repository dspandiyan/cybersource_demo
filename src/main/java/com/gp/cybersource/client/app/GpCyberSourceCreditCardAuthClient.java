package com.gp.cybersource.client.app;

import com.gp.cybersource.common.client.GPCyberSourceServiceRequestData;
import com.gp.cybersource.common.dto.CreditCardAuthRequestDTO;
import com.gp.cybersource.common.dto.CreditCardAuthResponseDTO;

public interface GpCyberSourceCreditCardAuthClient {

	CreditCardAuthResponseDTO authCreditCard(final CreditCardAuthRequestDTO creditCardAuthReqDTO,
			final GPCyberSourceServiceRequestData serviceRequestData);
}
