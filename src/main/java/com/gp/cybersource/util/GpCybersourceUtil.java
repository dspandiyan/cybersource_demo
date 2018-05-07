package com.gp.cybersource.util;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

@Component
public class GpCybersourceUtil {

	private GpCybersourceUtil() {

	}

	public static Map<String, String> getHeadersFromRequest(HttpServletRequest request) {
		Map<String, String> requestHeader = new HashMap<>();
		Enumeration<String> headers = request.getHeaderNames();
		while (headers.hasMoreElements()) {
			String header = headers.nextElement();
			requestHeader.put(header, request.getHeader(header));
		}
		return requestHeader;
	}

}
