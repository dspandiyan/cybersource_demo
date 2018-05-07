package com.gp.cybersource.service;

import java.util.Map;

import com.gp.cybersource.common.dto.CreditCardAuthRequestDTO;
import com.gp.cybersource.common.dto.CreditCardAuthResponseDTO;

public interface CreditCardAuthService {

	CreditCardAuthResponseDTO authCreditCard(final CreditCardAuthRequestDTO creditCardAuthReqDTO,
			final Map<String, String> requestHeader);

}
