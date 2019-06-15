package com.dependecyinjection.springboot.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.dependecyinjection.springboot.app.models.service.MyServiceImpl;
import com.dependecyinjection.springboot.app.models.service.MyService;
import com.dependecyinjection.springboot.app.models.service.MyServiceComplexImpl;

@Configuration
public class AppConfig {

	@Bean("SimpleService")
	public MyService registerMyService() {
		return new MyServiceImpl();
	}
	
	@Bean("ComplexService")
	@Primary
	public MyService registerMyServiceComplex() {
		return new MyServiceComplexImpl();
	}
	
}
