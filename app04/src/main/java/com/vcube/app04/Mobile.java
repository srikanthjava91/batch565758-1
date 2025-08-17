package com.vcube.app04;

import org.springframework.beans.factory.annotation.Value;

public class Mobile {

//	@Value(value = "9R")
	String model;
//	@Value(value = "One Plus")
	String brand;
//	@Value(value = "40000.00")
	double price;

	void show() {
		System.out.println("Mobile model : " + model);
		System.out.println("Mobile brand : " + brand);
		System.out.println("Mobile Price : " + price);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
