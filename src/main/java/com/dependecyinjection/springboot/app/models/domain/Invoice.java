package com.dependecyinjection.springboot.app.models.domain;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Invoice {

	@Value("${invoice.description}")
	private String description;
	@Autowired
	private Client client;
	@Autowired
	@Qualifier("itemInvoiceGamer")
	private List<ItemInvoice> items;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<ItemInvoice> getItems() {
		return items;
	}
	public void setItems(List<ItemInvoice> items) {
		this.items = items;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Client name: ".concat(client.getName()));
		client.setName(client.getName().concat(" ").concat("Beatriz"));
		System.out.println("Description: ".concat(description));
		description = description.concat(" of the client: ").concat(client.getName());
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Invoice destroyed: ".concat(description));
	}
}
