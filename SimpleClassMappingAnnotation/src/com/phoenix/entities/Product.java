package com.phoenix.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @author md.faisal
 * @creation date 07-10-2021
 * @version 2.0
 * @copyright sterlite technology
 * It is a pojo class which act as persistent class
 * or entity class in Hibernate
 * It uses JPA Annotations
 */
@Entity
@Table(name="PRODUCT1")//optional if table and class name same
public class Product {
	
	//attributes or instance variables
	@Id
	@GeneratedValue(generator = "increment")
	@Column(name="ID")
	private int productId;
	
	@Column(name="NAME")
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
