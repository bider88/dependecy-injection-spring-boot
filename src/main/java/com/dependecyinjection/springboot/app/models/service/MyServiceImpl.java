package com.dependecyinjection.springboot.app.models.service;

import org.springframework.stereotype.Component;

@Component("SimpleService")
public class MyServiceImpl implements MyService {

	@Override
	public String operator() {
		return "Executing something process with Dependecy Injection...";
	}
	
}
