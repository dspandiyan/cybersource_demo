package com.gp.cybersource.client.soap;

import java.util.Map;

import com.gp.cybersource.common.client.GPCyberSourceServiceRequestData;
import com.gp.cybersource.common.stub.ReplyMessage;

public interface GpCyberSourceSoapClient {

	public ReplyMessage getResponse(Object request, GPCyberSourceServiceRequestData requestData,
			Map<String, String> requestHeader);
}
