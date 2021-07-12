package com.phoenix.entities;
/*
 * @author md.faisal
 * @creation date 07-10-2021
 * @version 1.0
 * @copyright sterlite technology
 * It is a pojo class which act as persistent class
 * or entity class in Hibernate
 */
public class Product {
	private int productId;
	private String productName;
	private String brand;
	private float price;
	//default constructor
	public Product() {
		// TODO Auto-generated constructor stub
	}
	//parametrized constructor
	public Product(int productId, String productName, String brand, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
	}
	//setter and getter
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", brand=" + brand + ", price="
				+ price + "]";
	}
	
	

}
