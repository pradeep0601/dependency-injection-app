package com.pradeep.spring.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE) // default scope is singelton
public class Alien {
	private int id;
	private String name;
	private String tech;
	@Autowired //default wiring is by type
	@Qualifier("lap")
	private Laptop laptop;
	
	public Alien() {
		System.out.println("Alien()");
	}
	
	public String getMessage() {
		return "Hello from Alien, I have laptop of brand: " + laptop.getBrand();
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

}
