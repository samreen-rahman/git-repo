package com.lti.model;

public class Product {
	int productId;
	String productName;
	String productDisciption;
	int quantity;
	
	pubic int getQuantity(){
		return quantity;
	}
	pubic int setQuantity(){
		this.quantity= quantity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDisciption() {
		return productDisciption;
	}
	public void setProductDisciption(String productDisciption) {
		this.productDisciption = productDisciption;
	}
	
	
}
