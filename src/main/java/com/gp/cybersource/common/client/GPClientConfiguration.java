package com.gp.cybersource.common.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class GPClientConfiguration {

	@Bean
	public Jaxb2Marshaller cyberSourceMarshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage>
		// specified in
		// pom.xml
		marshaller.setContextPath("com.gp.cybersource.common.stub");
		return marshaller;
	}

}
