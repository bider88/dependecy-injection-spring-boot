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
		Product product2 = new Product("Cycle Bike", 700);
		
		ItemInvoice line1 = new ItemInvoice(product1, 2);
		ItemInvoice line2 = new ItemInvoice(product2, 4);
		
		return Arrays.asList(line1, line2);
	}
	
	@Bean("itemInvoiceGamer")
	public List<ItemInvoice> registerItemsGamer() {
		Product product1 = new Product("Controller  X One", 200);
		Product product2 = new Product("Video Game Horror", 280);
		Product product3 = new Product("Video Game Survivor", 260);
		Product product4 = new Product("Console X One", 500);
		
		ItemInvoice line1 = new ItemInvoice(product1, 2);
		ItemInvoice line2 = new ItemInvoice(product2, 1);
		ItemInvoice line3 = new ItemInvoice(product3, 1);
		ItemInvoice line4 = new ItemInvoice(product4, 1);
		
		return Arrays.asList(line1, line2, line3, line4);
	}
}
