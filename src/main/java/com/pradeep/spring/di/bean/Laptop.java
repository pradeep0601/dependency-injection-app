package com.pradeep.spring.di.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("lap")
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Laptop {

	private int id;
	private String brand;

	public Laptop() {
		System.out.println("Laptop()");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		if(brand == null) {
			return "Lenovo";
		}
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
