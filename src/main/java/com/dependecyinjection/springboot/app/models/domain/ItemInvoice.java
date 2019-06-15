package com.dependecyinjection.springboot.app.models.domain;

public class ItemInvoice {
	private Product product;
	private Integer quantity;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public ItemInvoice(Product product, Integer quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public Integer getAmount() {
		return product.getPrice() * quantity;
	}
	
}
