package com.dependecyinjection.springboot.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("SimpleServiceComplex")
//Indicamos cual es la implementación principal o por defecto
@Primary
public class MyServiceComplexImpl implements MyService {

	@Override
	public String operator() {
		return "Executing something very Complexxx process with Dependecy Injection...";
	}
	
}
