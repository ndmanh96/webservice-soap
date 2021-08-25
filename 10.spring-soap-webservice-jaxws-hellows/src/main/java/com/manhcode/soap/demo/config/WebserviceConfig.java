package com.manhcode.soap.demo.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.manhcode.soap.demo.service.HelloService;

@Configuration
public class WebserviceConfig {

	@Autowired
	private Bus bus;

	@Bean
	public Endpoint endpoint() {
		Endpoint endpoint = new EndpointImpl(bus, new HelloService());
		endpoint.publish("/hello"); // http://localhost:8080/hellows/hello
		return endpoint;
	}
}
