package com.gp.cybersource.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gp.cybersource.common.dto.CreditCardAuthRequestDTO;
import com.gp.cybersource.common.dto.CreditCardAuthResponseDTO;
import com.gp.cybersource.service.CreditCardAuthService;
import com.gp.cybersource.util.GpCybersourceUtil;

@RestController
public class GpCybersourceCreditCardController {

	@Resource(name = "creditCardAuthServiceImpl")
	CreditCardAuthService creditCardAuthService;

	@RequestMapping(value = "/cybersource/ccauth", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public CreditCardAuthResponseDTO authorizeCreditCard(@RequestBody CreditCardAuthRequestDTO creditCardAuthReqDTO,
			HttpServletRequest request) {
		return creditCardAuthService.authCreditCard(creditCardAuthReqDTO,
				GpCybersourceUtil.getHeadersFromRequest(request));
	}
}
