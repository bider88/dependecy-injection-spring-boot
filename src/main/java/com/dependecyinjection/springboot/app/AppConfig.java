package com.dependecyinjection.springboot.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.dependecyinjection.springboot.app.models.service.MyServiceImpl;
import com.dependecyinjection.springboot.app.models.domain.ItemInvoice;
import com.dependecyinjection.springboot.app.models.domain.Product;
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
	
	@Bean("itemInvoice")
	public List<ItemInvoice> registerItems() {
		Product product1 = new Product("Huawei Phone", 1200);
		Product product2 = new Product("Cycle Bike", 1200);
		
		ItemInvoice line1 = new ItemInvoice(product1, 2);
		ItemInvoice line2 = new ItemInvoice(product2, 4);
		
		return Arrays.asList(line1, line2);
	}
}
