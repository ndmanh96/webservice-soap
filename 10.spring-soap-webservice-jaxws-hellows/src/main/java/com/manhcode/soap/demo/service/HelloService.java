package com.manhcode.soap.demo.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.cxf.feature.Features;

@WebService
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class HelloService {
	@WebMethod
	public String hello() {
		return "Hello";
	}
}
