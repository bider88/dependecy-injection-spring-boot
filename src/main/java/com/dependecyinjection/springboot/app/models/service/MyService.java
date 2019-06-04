package com.dependecyinjection.springboot.app.models.service;

import org.springframework.stereotype.Component;

@Component
public class MyService {

	public String operator() {
		return "Executing something process...";
	}
	
}
